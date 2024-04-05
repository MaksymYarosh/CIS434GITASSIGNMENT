import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class GroupTest {

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
    public void testGetGroupMembers() {
        Group group = new Group();
        ArrayList<String> expectedMembers = new ArrayList<>();
        expectedMembers.add("Manikdeep Kaur LNU");
        expectedMembers.add("Maksym Yashor");
        expectedMembers.add("Malik Jamal");
        assertEquals(expectedMembers, group.getGroupMembers());
    }

    @Test
    public void testPrintName() {
        Group group = new Group();
        assertEquals("Manikdeep Kaur LNU", group.printingName());
        assertEquals("Maksym Yashor", group.printName());
        assertEquals("Malik Jamal", group.printedName());
    }


    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        Group group = new Group();
        group.divide(10,0);
        assertEquals(5, group.divide(10, 2));
        assertEquals(-5, group.divide(-10, 2));
        assertEquals(6, group.divide(13, 2));
    }

    @Test
    public void testMultiply() {
        Group group = new Group();
        assertEquals(15, group.multiply(5, 3));
        assertEquals(-15, group.multiply(-5, 3));
    }

    @Test
    public void testPower() {
        Group group = new Group();
        assertEquals(8, group.power(2, 3));
        assertEquals(1, group.power(2, 0));
        assertEquals(0, group.power(0, 3));
    }
}
