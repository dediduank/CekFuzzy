/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekfuzzy;

/**
 *
 * @author Dedi Wardani
 */
public class Permintaan {
    static double permintaan;
    
    private static double permintaanSedikit=3000;
    private static double permintaanBanyak=12000;
    
    //buat method untuk mengakses nilai pada variabel NilaiUas
    public static double getPermintaan() {
        return permintaan;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setPermintaan(double permintaan) {
         Permintaan.permintaan = permintaan;
    }
    
    //FUZZIFIKASI
    //method fungsi turun
    public static double turun(){
        if(permintaan <= permintaanSedikit)return 1;
        else if(permintaan > permintaanSedikit && permintaan <permintaanBanyak) return (permintaanBanyak-permintaan)/(permintaanBanyak-permintaanSedikit);
        else return 0;
    }
    
    //method fungsi naik
    public static double naik(){
        if(permintaan <= permintaanSedikit)return 0;
        else if(permintaan > permintaanSedikit && permintaan <permintaanBanyak) return (permintaan-permintaanSedikit)/(permintaanBanyak-permintaanSedikit);
        //10000 didapat dari permintaan terbanyak dikurang permintaan paling sedikit
        else return 1;
    }
 
}
