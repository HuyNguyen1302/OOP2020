package Task2;

public class arithmeticException {
    public static int Arithmetic() throws ArithmeticException{
        int a = 5, b = 0;
        return a/b;
    }

    public static void main([String[] args){
        try {
            System.out.println(Arithmetic());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
