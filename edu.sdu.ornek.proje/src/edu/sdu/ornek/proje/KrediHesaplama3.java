package edu.sdu.ornek.proje;

public class KrediHesaplama3 {
    
    FaizOran faizOran;
    
    public double faizHesapla(double anaPara){ 
        return anaPara/100*faizOran.aylikOran();     
    }
}
