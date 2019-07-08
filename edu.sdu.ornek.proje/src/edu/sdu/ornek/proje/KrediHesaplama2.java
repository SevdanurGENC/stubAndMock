package edu.sdu.ornek.proje;

public class KrediHesaplama2 {
    
    public HesaplamaKayit hesaplamaKayit;
    
    public double faizHesapla(double anaPara, double oran){
    
        if(oran<1.0){
            oran = 1.0;
        }
        
        hesaplamaKayit.hesaplamayiKaydet(anaPara, oran); //stub yontemi
        return anaPara/100*oran;       
        
    }
}
