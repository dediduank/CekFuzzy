/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekfuzzy;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Dedi Wardani
 */
public class Rule {
    private static double [] u_Produksi = new double[4];
    private static double [] z_Produksi = new double[4];
    private static double bobot;
    //menghitung fungsi keanggotaan
    public static void hitung_u(){
        u_Produksi[0]=Math.min(Permintaan.turun(), Persediaan.banyak());
        u_Produksi[1]=Math.min(Permintaan.turun(), Persediaan.sedikit());
        u_Produksi[2]=Math.min(Permintaan.naik(), Persediaan.banyak());
        u_Produksi[3]=Math.min(Permintaan.naik(), Persediaan.sedikit());
    }
    //mengaplikasikan rule yang sudah dibuat
    public static void hitung_z(){
        z_Produksi[0]=NilaiZ.ProduksiTurun(u_Produksi[0]);
        z_Produksi[1]=NilaiZ.ProduksiTurun(u_Produksi[1]);
        z_Produksi[2]=NilaiZ.ProduksiNaik(u_Produksi[2]);
        z_Produksi[3]=NilaiZ.ProduksiNaik(u_Produksi[3]);
    }
    //eend of rule
    
    
    
    //cari nilai bobot (tsukamoto)
    public static double bobot(){
        double hitungUZ=0,hitungZ=0;
        DecimalFormat df = new DecimalFormat("#.##");
        for(int i=0;i<4;i++){
            BigDecimal bd = new BigDecimal(u_Produksi[i]);
            bd = bd.setScale(2,BigDecimal.ROUND_UP);
            double dmy = bd.doubleValue();
            
            System.out.println("z_ke-"+i+ " : " + Math.ceil(z_Produksi[i]));
            System.out.println("u_ke-"+i+ " : " + dmy);
            System.out.println("hasil u * z " + i+ "=" + dmy *Math.ceil(z_Produksi[i]));
            hitungUZ+=(dmy*Math.ceil(z_Produksi[i]));
            hitungZ+=dmy;
        }
//        System.out.println("\n"+atas/bawah);
//        
        System.out.println("\nNILAI Total U*Z "+hitungUZ + " Total Nilai Z " + df.format(hitungZ));
        return (hitungUZ/hitungZ);
    }
    
    
}
