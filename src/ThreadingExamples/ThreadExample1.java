package ThreadingExamples;

public class ThreadExample1 extends Thread {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
ThreadExample1 obj = new ThreadExample1();
obj.start();
    }
}