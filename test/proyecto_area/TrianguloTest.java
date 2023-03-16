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
public class TrianguloTest {
    
    public TrianguloTest() {
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
     * Test of area_tri method, of class Triangulo.
     */
    @Test
    public void testArea_tri() {
        System.out.println("area_tri");
        Triangulo instance = new Triangulo(15,15,10);
        float expResult = 112.5F;
        float result = instance.area_tri();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of perimetro_tri method, of class Triangulo.
     */
    @Test
    public void testPerimetro_tri() {
        System.out.println("perimetro_tri");
        Triangulo instance = new Triangulo(15,15,10);
        float expResult = 40.0F;
        float result = instance.perimetro_tri();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
