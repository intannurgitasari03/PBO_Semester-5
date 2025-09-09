package Nilai;

import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        while (true) {
            System.out.print("Masukkan nilai (0-100): ");
            nilai = input.nextInt();

            if (nilai >= 0 && nilai <= 100) {
                break; 
            } else {
                System.out.println("Nilai tidak valid! Masukkan dengan rentang angka 0 - 100 saja.");
            }
        }

        CekNilai cek = new CekNilai(nilai);

        System.out.println(cek.cekLulus());
        System.out.println(cek.cekGrade());

        input.close();
    }
}
