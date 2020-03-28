import static org.junit.Assert.*;
import org.junit.Test;

public class JUnit {

    @Test
    public void assertTests() {

        // Variables being declared
        int oneA = 1;
        int twoA = 2;
        int oneB = 1;
        int twoB = 3;

        String s1 = "True";
        String s2 = "False";
        String s3 = null;
        String s4 = "True";
        
        // Assert statements
        assertEquals(oneA, oneB);
        assertNotEquals(twoA, twoB);
        assertSame(s1, s4);
        assertNull(s3);
        assertNotNull(s2);
        assertTrue(twoB>twoA);
        assertFalse(twoB<oneA);
    }
}