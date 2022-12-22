package ThreadingExamples;
//Java Thread Example by extending Thread class
public class ClassExtendsThread extends Thread{
    public void run(){
        System.out.println("thread is running by extending Thread class");
    }

    public static void main(String[] args) {
        ClassExtendsThread myobj = new ClassExtendsThread();
        myobj.start();
        System.out.println("the state of the thread is: "+myobj.getState());
    }
}
