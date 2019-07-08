package edu.sdu.ornek.proje;

public class KrediHesaplama {

    public static double faizHesaplama(double anaPara,double oran){
        //return anaPara/100*oran; 
        if (oran<1.0)
            oran = 1.0;
        return anaPara/100*oran; 
    } 
}
