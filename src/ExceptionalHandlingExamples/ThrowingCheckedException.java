package ExceptionalHandlingExamples;
import java.io.*;
public class ThrowingCheckedException extends Throwable {
    public ThrowingCheckedException(String str) {

    }

    public static void method() throws FileNotFoundException{
        FileReader file=new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileInput=new BufferedReader(file);

        throw new FileNotFoundException();
    }


}
