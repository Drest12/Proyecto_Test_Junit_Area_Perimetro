package proyecto_area;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antony
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area_rec method, of class Rectangulo.
     */
    @Test
    public void testArea_rec() {
        System.out.println("area_rec");
        Rectangulo instance = new Rectangulo(15,10);
        float expResult = 150.0F;
        float result = instance.area_rec();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of perimetro_rec method, of class Rectangulo.
     */
    @Test
    public void testPerimetro_rec() {
        System.out.println("perimetro_rec");
        Rectangulo instance = new Rectangulo(15,10);
        float expResult = 50.0F;
        float result = instance.perimetro_rec();
        assertEquals(expResult, result, 0.0);
       
    }
    
}
