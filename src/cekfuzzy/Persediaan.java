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
public class Persediaan {
    static double persediaan;
    
    private static double persediaanSedikit=400;
    private static double persediaanBanyak=1000;
    
    //buat method untuk mengakses nilai pada variabel NilaiUas
    public static double getPersediaan() {
        return persediaan;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setPersediaan(double persediaan) {
         Persediaan.persediaan = persediaan;
    }
    
    //FUZZIFIKASI
    //method fungsi sedikit
    public static double sedikit(){
       double result;
        if(persediaan <= persediaanSedikit){
            result = 1;
            return result;
        }
        else if( persediaan>= persediaanSedikit && persediaan <=persediaanBanyak){
            result =(persediaanBanyak-persediaan)/(persediaanBanyak-persediaanSedikit);
            return result;
        } 
        else{
            result = 0;
            return result;
        }
    }
    
    //method fungsi banyak
    public static double banyak(){
        //double result = (persediaan-persediaanSedikit)/500;
        if(persediaan <= persediaanSedikit)return 0;
        else if( persediaan>= persediaanSedikit && persediaan <=persediaanBanyak) {
            return (persediaan-persediaanSedikit)/(persediaanBanyak-persediaanSedikit);
        }
         //400 diambil dari nilai persediaan terbanyak dikurang persediaan tersedikit
        else return 1;
    }
}
