/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal9;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : EJAAN NAMA
 */
import java.util.Scanner;

public class SOAL9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama depan Anda untuk di eja: ");
        String nama = scanner.nextLine();

        // Mengeja setiap huruf dari nama yang diinputkan
        System.out.println(" Ejaan untuk '" +nama+ "' Adalah");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }

        // Menutup scanner
        scanner.close();
    }
}

