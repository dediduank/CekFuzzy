/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekfuzzy;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 *
 * @author Dedi Wardani
 */
public class CekFuzzy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Permintaan.setPermintaan(11000);
        Persediaan.setPersediaan(525);
        
        Rule.hitung_u();
        Rule.hitung_z();
        
        double nilai = Rule.bobot();
        int nFinal =  (int)Math.round(nilai);
        System.out.println("\nTotal Barang yang harus diproduksi adalah = "+ nFinal + "\n" );
    }
    
}
