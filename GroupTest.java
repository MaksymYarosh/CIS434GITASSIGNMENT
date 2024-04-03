import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupTest{

  public GroupTest(){
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
    public void testPrintingName() {
        Group instance = new Group();
        assertEquals("Manikdeep Kaur LNU", instance.printingName());
    }

    @Test
    public void testPrintName() {
        Group instance = new Group();
        assertEquals("Maksym Yarosh", instance.printName());
    }

    @Test
    public void testPrintedName() {
        Group instance = new Group();
        assertEquals("Malik Jamal", instance.printedName());
    }

    @Test
    public void testGetGroupMembers() {
        Group instance = new Group();
        instance.getGroupMembers(); // No assertions because it doesn't return anything
    }

    @Test(expected=ArithmeticException.class)
    public void testIntegerDivision() {
        Group instance = new Group();
        assertEquals(2, instance.division(8, 4));//Positive division
        assertEquals(0, instance.division(0, 5)); // Testing division by zero
        assertEquals(-2, instance.division(-8,4));//Negative division 
}
}
