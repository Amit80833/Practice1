package ThreadingExamples;
//Using the Thread Class: Thread(Runnable r, String name)
 class UsingThreadClassConstructor implements Runnable{
    @Override
    public void run() {
        System.out.println("Now the thread is running");
    }

    public static void main(String[] args) {
        // creating an object of the class MyThread2
        Runnable r1 = new UsingThreadClassConstructor();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1,"My new thread");

        th1.start();
        String str = th1.getName();
        System.out.println(str);
        System.out.println("the details about the thread:"+th1.getId()+" "+th1.getName()+" "+th1.getPriority()+" "+th1.getState()+" "+th1.getStackTrace()+" "+th1.isAlive()+" "+th1.isDaemon()+" "+th1.isInterrupted());
    }
}
