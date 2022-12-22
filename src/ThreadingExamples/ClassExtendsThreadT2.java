package ThreadingExamples;

public class ClassExtendsThreadT2 {
    public static void main(String[] args) {
        //// creating an object of the Thread class using the constructor Thread(String name)
        Thread t1 = new Thread("my first thread");
        t1.start();
        // getting the thread name by invoking the getName() method
        String str=t1.getName();
        System.out.println(str);
        System.out.println("the details about the thread:"+t1.getId()+" "+t1.getName()+" "+t1.getPriority()+" "+t1.getState()+" "+t1.getStackTrace()+" "+t1.isAlive()+" "+t1.isDaemon()+" "+t1.isInterrupted());
    }
}
