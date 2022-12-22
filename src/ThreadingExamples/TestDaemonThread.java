package ThreadingExamples;

public class TestDaemonThread extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("daemon thread is working");
        }
        else {
            System.out.println("user thread is working");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread tdt1 = new TestDaemonThread();
        TestDaemonThread tdt2 = new TestDaemonThread();
        TestDaemonThread tdt3 = new TestDaemonThread();
         tdt1.setDaemon(true);
         tdt3.setDaemon(true);

         tdt1.start();
         tdt2.start();
         tdt3.start();
         tdt2.setDaemon(true);
    }
}
