package ThreadingExamples;

public class ThreadingPriorityExample extends Thread{
    @Override
    public void run() {
        System.out.println("inside the run() method");
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(7);

        System.out.println("the priority of the main thread is: "+Thread.currentThread().getPriority());

        ThreadingPriorityExample tpe = new ThreadingPriorityExample();
        tpe.setPriority(5);
        System.out.println("the priority of the child thread "+tpe.getPriority());


    }
}
