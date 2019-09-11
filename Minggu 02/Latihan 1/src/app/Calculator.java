package app;

public class Calculator {
    private int initVal = 5;
    public int sum(int a) {
       return initVal + a;
    }

    public static void main(String[] args) {
    
        System.out.println("Hasil penjualan  adalah " + sum(10) + initVal);    
    } 
}