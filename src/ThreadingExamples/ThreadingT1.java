package ThreadingExamples;

class ThreadingT1 implements Runnable{
    public void run(){
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The State of thread T1 while it invoked the method join() on thread T2- "+ThreadState.T1.getState());

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
class ThreadState implements Runnable{
    public static Thread T1;
    public static ThreadState obj;

    public static void main(String[] args) {
        obj = new ThreadState();
        T1 = new Thread(obj);//thread T1 is currently in NEW state
        System.out.println("The state of thread T1 after spawning it-" + T1.getState());

        T1.start();//thread T1 is moved to Runnable state
        System.out.println("the thread is in the runnable state after invoking the start() method-" + T1.getState());
    }

    @Override
    public void run() {
        ThreadingT1 myobj = new ThreadingT1();
        Thread T2=new Thread(myobj);//thread T2 is in new state
        System.out.println("the state of thread T2 after spawning- "+T2.getState());

        T2.start();//now the thread T2 is in runnable state
        System.out.println("the state of thread T2 after invoking start() method on it- "+T2.getState());

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("the state of the thread T2 after invoking the method sleep() on it- "+T2.getState());

        try {
            T2.join();
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("the state of the thread T2 when it has completed its execution="+T2.getState());


    }
}