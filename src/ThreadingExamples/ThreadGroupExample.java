package ThreadingExamples;

public class ThreadGroupExample implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample runnable = new ThreadGroupExample();
        ThreadGroup tg1 = new ThreadGroup("Parent Thread Group");

        Thread t1 = new Thread(tg1,runnable,"one");
        t1.start();
        Thread t2 = new Thread(tg1,runnable,"Two");
        t2.start();
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
        Thread t3 = new Thread(tg1,runnable,"Three");
        t3.start();

        System.out.println("Thread group Name: "+tg1.getName());
        tg1.list();
    }
}
