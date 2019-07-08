package edu.sdu.ornek.proje.test;

import edu.sdu.ornek.proje.KrediHesaplama; 
import org.junit.Test;
import static org.junit.Assert.*;

public class KrediHesaplamaTest {
       
    KrediHesaplama krediHesaplama = new KrediHesaplama();
     
    @Test
    public void faizHesaplamaTest() { 
        double hesaplananFaiz = krediHesaplama.faizHesaplama(100.0,1.20);
        assertEquals(1.20, hesaplananFaiz, 0.001);
      } 
    
    
    @Test
    public void faizHesaplamaBirAltiTest(){
	double hesaplananFaiz = krediHesaplama.faizHesaplama(100.0, 0.80);
	assertEquals(1.00, hesaplananFaiz, 0.001);
    }
    
}
