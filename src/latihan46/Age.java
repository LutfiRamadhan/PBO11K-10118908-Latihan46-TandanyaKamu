/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan46;

import java.util.Calendar;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
class Age {
    private int yearBirth, yearNow;
    private static final String red = "\u001B[31m";

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        Calendar cal = Calendar.getInstance();
        this.yearNow = cal.get(Calendar.YEAR);
        return yearNow;
    }
    
    public int hitungUmur(){
        return this.yearNow - this.yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        if (umur >= 0 && umur <= 5) {
            return red+"LAGI LUCU-LUCU NYA";
        }else if (umur > 5 && umur <= 10) {
            return red+"MASIH ANAK ANAK";
        }else if(umur > 10 && umur <= 13){
            return red+"MASIH REMADJA";
        }else if(umur > 13 && umur <= 19){
            return red+"ALAY";
        }else if(umur > 19 && umur <= 29){
            return red+"LAGI GALAU NYARI JODOH";
        }else if(umur > 29 && umur <= 35){
            return red+"LAGI SIBUK NYARI UANG";
        }else if(umur > 35 && umur <= 150){
            return red+"SUDAH TUA";
        }else{
            return red+"TIDAK TERDETEKSI DI KEHIDUPAN";
        }
    }
    
}
