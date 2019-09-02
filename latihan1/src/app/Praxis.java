package app;

import java.util.Scanner;

public class Praxis {
    public static void main(String[] args) {
        String nama, status;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap anda : ");
        nama = input.nextLine();

        System.out.print("Status pernikahan (sudah/belum) : ");
        status = input.nextLine();

        if (status.equals("sudah")) {
            System.out.println(nama + " Selamat");
        } else {
            System.out.println(nama + " Anda belum beruntung");
        }
    }
} 