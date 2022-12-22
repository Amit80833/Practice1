package ThreadingExamples;

public class MultiThreadingExample extends  Thread{
    @Override
    public void run() {
        System.out.println("Task one");
    }
}
class MultiThreadingExample2 extends Thread{
    @Override
    public void run() {
        System.out.println("Task two");
    }
}

class TestMultiThreading{
    public static void main(String[] args) {
        MultiThreadingExample mte = new MultiThreadingExample();
        MultiThreadingExample2 mte2 = new MultiThreadingExample2();


        mte.start();
        mte2.start();
    }
}