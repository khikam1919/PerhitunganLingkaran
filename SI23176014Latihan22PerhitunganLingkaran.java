/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan22.perhitunganlingkaran;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini berisi untuk menghitung jari-jari, luas, dan keliling dari 
 * lingkaran berdasarkan input diameter yang valid
 */
import java.util.Scanner;

public class SI23176014Latihan22PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;
        boolean isValid = false;

        System.out.println("======Perhitungan Lingkaran======");

        // Loop untuk memastikan input diameter yang valid
        while (!isValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (scanner.hasNextDouble()) { // Memeriksa apakah input berupa angka
                diameter = scanner.nextDouble();
                if (diameter > 0) { // Memastikan diameter lebih besar dari 0
                    isValid = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.next(); // Menghapus input yang tidak valid
            }
        }

        // Menghitung jari-jari, luas, dan keliling lingkaran
        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        // Menampilkan hasil perhitungan
        System.out.println("=======Hasil Perhitungan Lingkaran=======");
        System.out.printf("Jari-jari Lingkaran = %.0f cm\n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm\n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm\n", keliling);

        scanner.close();
    }
}