package Task2;


public class nullPointException {
    public static int nullPointer() throws NullPointerException{
        String text = null;
        return text.length();
    }

    public static void main(String[] args){
        String s = "Hello World";
        int length = s.length();
        System.out.println("Lenght s = "+ length);

        try{
            System.out.println(nullPointer());
        } catch (NullPointerException e){
            System.out.println(e.getMessage())
        }
    }

}
