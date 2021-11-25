/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekfuzzy;

import java.math.BigDecimal;

/**
 *
 * @author Dedi Wardani
 */
public class NilaiZ {
    static double produksiMax = 1000;
    static double produksiMin = 400;
    
    public static double ProduksiTurun(double inpnilai){
        double result = produksiMax-(inpnilai*(produksiMax-produksiMin));
        return (result);
    }    
    public static double ProduksiNaik(double inpnilai){
       
        
       
        BigDecimal bd = new BigDecimal(inpnilai);
        bd = bd.setScale(2,BigDecimal.ROUND_UP);
        inpnilai = bd.doubleValue();
        
        
        double result = produksiMin+(inpnilai*(produksiMax-produksiMin));
        return (result);
    }
}
