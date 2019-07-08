package edu.sdu.ornek.proje.test;

import edu.sdu.ornek.proje.HesaplamaKayit;
import edu.sdu.ornek.proje.KrediHesaplama2;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*; 
public class KrediHesaplama3Test {
    
    KrediHesaplama2 krediHesaplama = new KrediHesaplama2();
                
    @Test
    public void faizHesaplamaTest() {
        
        krediHesaplama.hesaplamaKayit = Mockito.mock(HesaplamaKayit.class); 
//hesaplamaKayit nesnesini taklit ettirdik (mocking)s
        double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
        assertEquals(1.20, hesaplananFaiz,0.001);
        
    } 
}
