package app;

public class Game{
    public static void main(String[] args) {
        
        Player petani = new Player();

        petani.name = "Petani kode";
        petani.speed = 78;
        petani.healthPoin = 0;

        petani.run();

        if(petani.isDead())
        {
            System.out.println("Game Over !");
        }
    }
}