
package com.mycompany.proxectofactura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author A21YagoVR
 */
public class ArtigoFacturaTest {
    
    public ArtigoFacturaTest() {
    }
    
    /**
     * Test of obterPrezoTotal method, of class ArtigoFactura.
     */
    @Test
    public void testObterPrezoTotal() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura instance = new ArtigoFactura("MP14", "Rato Inalámbrico", 20, 10);
        double expResult = 200.0;
        double result = instance.obterPrezoTotal();
        assertEquals(expResult, result, 0.0);
    }
    
}
