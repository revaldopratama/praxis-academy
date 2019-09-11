package app;

public class ObjectWithPureFunction{

    static int jumlah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    
        System.out.println("Hasil penjualan 10+10 adalah " + jumlah(10, 10));    
    } 
}