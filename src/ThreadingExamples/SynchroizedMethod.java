package ThreadingExamples;

public class SynchroizedMethod {
    synchronized void printTable(int n){
        for (int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread1 extends Thread{
    SynchroizedMethod sm;
    MyThread1(SynchroizedMethod sm){
        this.sm=sm;
    }

    @Override
    public void run() {
        sm.printTable(5);
    }
}
class MyThread2 extends Thread{
    SynchroizedMethod sm;
    MyThread2(SynchroizedMethod sm){
        this.sm=sm;
    }

    @Override
    public void run() {
         sm.printTable(100);
    }
}
class TestSynchronization{
    public static void main(String[] args) {
        SynchroizedMethod obj = new SynchroizedMethod();
        MyThread1 mt1 = new MyThread1(obj);
        MyThread2 mt2 = new MyThread2(obj);
        mt1.start();
        mt2.start();
    }
}