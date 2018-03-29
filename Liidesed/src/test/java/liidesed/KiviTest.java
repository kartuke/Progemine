
package liidesed;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KiviTest {
    
    public KiviTest() {
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

    @Test
    public void testKysiX() {
        System.out.println("kysiX");
        Kivi instance = new Kivi (2,5);
        int expResult = 2;
        int result = instance.kysiX();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testKysiY() {
        System.out.println("kysiY");
        Kivi instance = new Kivi (7,2);
        int expResult = 2;
        int result = instance.kysiY();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
