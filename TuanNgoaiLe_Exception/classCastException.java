package Task2;

public class classCastException {
    public static int ClassCast(Object s) throws ClassCastException{
        s = 13.2;
        return (int) s;
    }

    public static void main(String[] args){
        try{
            System.out.println(ClassCast());
        } catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}
