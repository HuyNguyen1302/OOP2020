package Phan3;

import java.text.DecimalFormat;

public class Task2 {
    //max 2 Int
    public int max2Int(int a, int b){
        if (a>=b) {return a};
        else {return b};
    }
    // Array
    private int[] a = new int[];

    public  int minArray(int[] array){
        if(array.length > 100 || array.length == 0) {
            return 0;
        }
        else {
            int min_arr = array[0];
            for (int i=0; i<array.length, i++){
                if (min_arr > array[i] ) {
                    min_arr = array[i];
                }
            }
        }
    }

    //BMI
    public string caculateBMI(double w, double h){
        double BMI = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        if (w<=0 || h<=0 ) {return "Enter w and h >0"};
        else {
            BMI = (double)(w/(h*h));

            if (BMI < 18.50) {System.out.println("Thiếu cân");}
            else if (BMI>=18.50 && BMI <= 22.99) {System.out.println("Bình thường");}
            else if (BMI>= 23 && BMI <= 24.9 ) {System.out.println("Thừa cân");}
            else {System.out.println("Béo phì");}
        }
    }
}
