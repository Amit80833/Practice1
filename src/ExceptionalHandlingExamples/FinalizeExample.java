package ExceptionalHandlingExamples;

public class FinalizeExample {
    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        System.out.println("Hash code is:"+obj.hashCode());
        obj=null;

        System.gc();
        System.out.println("End of garbage collection");
    }
    protected void finalize(){
        System.out.println("called the finalize method");
    }
}
