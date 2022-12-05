package ExceptionalHandlingExamples;

public class TestThrows {
    public static int divideNum(int m,int n)throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String[] args) {
        TestThrows obj =new TestThrows();
        try {
            System.out.println(obj.divideNum(30,0));
        }
        catch (ArithmeticException e){
            System.out.println("Number cannot be divided by 0");
        }
        System.out.println("rest of the code ,edited in the github account online");
    }

}
