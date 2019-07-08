package edu.sdu.ornek.proje.test;

import edu.sdu.ornek.proje.HesaplamaKayit;
import edu.sdu.ornek.proje.KrediHesaplama2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner; 
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class KrediHesaplama4Test { 
    @InjectMocks
    KrediHesaplama2 krediHesaplama;
    @Mock
    HesaplamaKayit hesaplamaKayit;
                
    @Test
    public void faizHesaplamaTest() {  
        double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
        assertEquals(1.20, hesaplananFaiz,0.001); 
    } 
}
