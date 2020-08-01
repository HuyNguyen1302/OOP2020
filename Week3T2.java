package Phan2;

import Phan1.Week3Task1;
public class Fraction {
    // thuoc tinh
    public int numerator, denominator;
    public int GetNumerator(){
        return numerator;
    }
    public void SetNumerator(){
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    //Constructors
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //reduce
    public Fraction reduce(int denominator, int numerator){
        if (numerator == 0) {
            return null;
        }
        else{
            Week3Task1 week3task1 = new Week3Task1();
            int ucln = week3task1.gcd(denominator,numerator);
            int d = denominator/ucln;
            int n = numerator/ucln;

            System.out.println(d + "/" + n);
            return new Fraction(d,n);
        }
    }
    //add
    public Fraction add(Fraction fraction){
        int d = (this.numerator*fraction.denominator + this.denominator*fraction.numerator);
        int n = (this.numerator*fraction.numerator);
        Fraction newFraction = reduce(d, n);
        return newFraction;
    }
    //subtract
    public Fraction subtract(Fraction fraction) {
        int d = (- this.numerator*fraction.denominator + this.denominator*fraction.numerator);
        int n = (this.numerator*fraction.numerator);

        Fraction newFraction = reduce(d, n);
        return newFraction;
    }
    //multiply
    public Fraction multiply(Fraction fraction) {
        int d = (fraction.denominator)*(this.denominator);
        int n = (this.numerator*fraction.numerator);

        Fraction newFraction = reduce(d, n);
        return newFraction;
    }
    //divide
    public Fraction divide(Fraction fraction) {
        int d = (fraction.numerator)*(this.denominator);
        int n = (this.numerator)*(fraction.denominator);

        Fraction newFraction = reduce(d, n);
        return newFraction;
    }
    //equal
    public boolean equals(Object object) {
        if (object instanceof Fraction) {
            Fraction other = (Fraction) object;
            if (other.getDenominator() == other.getDenominator()) {
                return true;
            } else  return false;
        }

        return false;
    }
}
