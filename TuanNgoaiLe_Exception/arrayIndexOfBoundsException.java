package Task2;

public class arrayIndexOfBoundsException {
    public static int ArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException{
        int [] Arr ={2,3};
        return  Arr[7];
    }

    public static void main(String[] args){
        try{
            System.out.println(ArrayIndexOutOfBounds());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
