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
        GroupTest group = new GroupTest();
        assertEquals("Manikdeep Kaur LNU", group.printingName());
    }

    @Test
    public void testPrintName() {
        GroupTest group = new GroupTest();
        assertEquals("Maksym Yarosh", group.printName());
    }

    @Test
    public void testPrintedName() {
        GroupTest group = new GroupTest();
        assertEquals("Malik Jamal", group.printedName());
    }

    @Test
    public void testGetGroupMembers() {
        // We can, however, test if they run without errors.
        GroupTest group = new GroupTest();
        group.getGroupMembers(); // No assertions because it doesn't return anything
    }

    @Test(expected=ArithmeticException.class)
    public void testIntegerDivision() {
        GroupTest group = new GroupTest();
        assertEquals(2, group.division(8, 4));//Positive division
        assertEquals(0, group.division(0, 5)); // Testing division by zero
        assertEquals(-2, group.division(-8,4));//Negative division 
}
}
