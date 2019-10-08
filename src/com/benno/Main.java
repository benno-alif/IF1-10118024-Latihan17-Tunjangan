package com.benno;
import java.util.Scanner;

    /*
        Nama        : Benno Alif Anggara
        Kelas       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Tunjangan
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============Program Tunjangan==============");

        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp. ");
        double gaji = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        String status = scanner.nextLine();
        status = scanner.nextLine();

        double tunjangan = hitungTunjangan(gaji, status);
        double totalGaji = hitungTotal(gaji, tunjangan);

        System.out.println("========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok\t\t: Rp. " + gaji);
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp. " + totalGaji);
        System.out.println("(Developed by : Benno Alif Anggara)");
    }

    public static double hitungTunjangan(double gaji, String status){
        double tunjangan;
        tunjangan = status.equals("Menikah") ? gaji*0.35 : 0;
        return tunjangan;
    }

    public static double hitungTotal(double gaji, double tunjangan){
        return gaji + tunjangan;
    }

}
