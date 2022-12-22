package ThreadingExamples;

public class ThreadExample1 extends Thread {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
ThreadExample1 obj = new ThreadExample1();
        System.out.println("before changing the name of thread: "+obj.getName());
obj.getName();
obj.start();
obj.setName("created thread AMIT");
        System.out.println("after changing the name of thread-1 :"+obj.getName());
    }
}