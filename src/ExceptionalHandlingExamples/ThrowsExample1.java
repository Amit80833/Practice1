package ExceptionalHandlingExamples;
import java.io.IOException;

public class ThrowsExample1 {
    void m()throws IOException{
        throw new IOException("device error");//checked error
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ThrowsExample1 obj=new ThrowsExample1();
        obj.p();
        System.out.println("normal flow");
    }
}
