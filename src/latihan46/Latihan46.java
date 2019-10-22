/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan46;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Age a = new Age();
        System.out.println("Masukkan Tahun Lahir Anda : ");
        int tahun = sc.nextInt();
        a.setYearBirth(tahun);
        System.out.println("=====Hasil perhitungan umur=====");
        System.out.println("Tahun Lahir Anda : "+tahun);
        System.out.println("Hari ini tahun : "+a.getYearNow());
        int umur = a.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah "+umur+" tahun");
        System.out.println("Tandanya Kamu "+a.tandanyaKamu(umur));
    }

}
