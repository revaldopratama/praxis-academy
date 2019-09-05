package app;

public class App {
    public static void main(String[] args) throws Exception {
        Bicycle myBike = new Bicycle(30, 0, 8);
        System.out.println( myBike.cadence);

        Bicycle yourBike = new Bicycle();
        System.out.println( yourBike.cadence); 
    }
}