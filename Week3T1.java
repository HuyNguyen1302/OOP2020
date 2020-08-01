package Phan1;

public class Week3Task1 {
    //a
    public int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    //b
    public int fibonacci(int n){
        if (n=0) return 0;
        else if (n=1) return 1;
        else if (n>1) (fibonacci(n-1)+fibonacci(n-2));
    }
    //c
    public void sieveEratosthenes(int n){
        boolean ise = true;
        if(n<=2 && n>0) {System.out.println("1 2");}
        else{
            for (int i=2;i<n/2;i++){
                if (n%i == 0) {
                    ise = false;
                    }
                }
            if (ise){
                System.out.println(n);
                }
            sieveEratosthenes(n-1);
            };
    }
}
