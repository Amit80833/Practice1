package ExceptionalHandlingExamples;

import java.io.IOException;

public class ThrowsExample3 {
    void method()throws IOException {
        throw new IOException("device error");
    }
}
class M{
    public static void main(String[] args)throws IOException    {
        ThrowsExample3 te3=new ThrowsExample3();
        te3.method();

        System.out.println("normal flow");
    }
}
