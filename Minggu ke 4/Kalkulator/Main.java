package Kalkulator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator hitung = new Kalkulator(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        System.out.println("\nPilih operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kali");
        System.out.println("3. Tambah & Kali");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println(a + " + " + b + " = " + hitung.tambah(a, b));
                break;
            case 2:
                System.out.println(a + " * " + b + " = " + hitung.kali(a, b));
                break;
            case 3:
                System.out.println(a + " + " + b + " = " + hitung.tambah(a, b));
                System.out.println(a + " * " + b + " = " + hitung.kali(a, b));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
