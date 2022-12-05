package ExceptionalHandlingExamples;

import java.io.IOException;

public class ThrowsExample2 {
    void method() throws IOException {
        throw new IOException("device error");
    }
}
    class m {
        public static void main(String[] args) {
            try {
                ThrowsExample2 tke = new ThrowsExample2();
                tke.method();
            } catch (Exception e) {
                System.out.println("exception handled");

                System.out.println("normal flow");
            }
        }
    }
