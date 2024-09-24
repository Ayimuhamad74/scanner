package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trapesiumBuffer {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Masukkan panjang sisi atas trapesium: ");
            String inputSisiAtas = reader.readLine();
            double sisiAtas = Double.parseDouble(inputSisiAtas);

            System.out.print("Masukkan panjang sisi bawah trapesium: ");
            String inputSisiBawah = reader.readLine();
            double sisiBawah = Double.parseDouble(inputSisiBawah);

            System.out.print("Masukkan tinggi trapesium: ");
            String inputTinggi = reader.readLine();
            double tinggi = Double.parseDouble(inputTinggi);

            double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;

            System.out.println("Luas trapesium adalah " + luas);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca input.");
        } catch (NumberFormatException e) {
            System.err.println("Masukan tidak valid. Pastikan Anda memasukkan angka.");
        }
    }

}
