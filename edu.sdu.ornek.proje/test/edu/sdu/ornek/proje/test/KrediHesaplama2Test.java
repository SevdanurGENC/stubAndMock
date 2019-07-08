package edu.sdu.ornek.proje.test;

import edu.sdu.ornek.proje.HesaplamaKayit;
import edu.sdu.ornek.proje.KrediHesaplama2;
import org.junit.Test;
import static org.junit.Assert.*;

public class KrediHesaplama2Test {
    
    KrediHesaplama2 krediHesaplama = new KrediHesaplama2();
    
    @Test
    public void faizHesaplaTest(){
        krediHesaplama.hesaplamaKayit = new HesaplamaKayit();
        
        double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
        assertEquals(1.20, hesaplananFaiz, 000.1); 
    } 
}
