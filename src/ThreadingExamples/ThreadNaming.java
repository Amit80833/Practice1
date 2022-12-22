package ThreadingExamples;

public class ThreadNaming extends Thread{
    ThreadNaming(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("thread is running");
    }
}
class TestName{
    public static void main(String[] args) {
        ThreadNaming tn1 = new ThreadNaming("Amit thread-1");
        ThreadNaming tn2 = new ThreadNaming("Amit thread-2");

tn1.setPriority(2);
        System.out.println("name of thread-1 is: "+tn1.getName());
        System.out.println("name of thread-2 is: "+tn2.getName());
        System.out.println(tn1.getPriority());
        tn1.start();
        tn2.start();
    }
}
