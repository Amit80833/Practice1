package ThreadingExamples;
//Java Thread Example by implementing Runnable interface
class ClassImplementsRunnable implements Runnable{
    public void run(){
        System.out.println("thread is running after implementing the runnable interface");
    }

    public static void main(String[] args) {
        ClassImplementsRunnable obj = new ClassImplementsRunnable();
        Thread T1 = new Thread(obj);
        T1.start();
        System.out.println("state of the thread: "+T1.getState()+" "+T1.getName()+" "+T1.getPriority()+" "+T1.getId());
    }
}
