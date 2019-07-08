package edu.sdu.ornek.proje.test;

import edu.sdu.ornek.proje.FaizOran;
import edu.sdu.ornek.proje.KrediHesaplama3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner; 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class KrediHesaplama5Test { 
    
    @InjectMocks
    KrediHesaplama3 krediHesaplama;
    @Mock
    FaizOran faizOran;
                
    @Test
    public void faizHesaplamaTest() {  
        when(faizOran.aylikOran()).thenReturn(1.20);
        double hesaplananFaiz = krediHesaplama.faizHesapla(100.0);
        assertEquals(1.20, hesaplananFaiz,0.001); 
    } 
}
