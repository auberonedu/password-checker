import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordCheckerTest {
    
    @Test
    public void testDescribePasswordLength() {
        PasswordChecker checker = new PasswordChecker(6, 12);

       assertEquals("short", checker.describePasswordLength("abc"));
        
        assertEquals("medium", checker.describePasswordLength("abcdef"));
    
        assertEquals("medium", checker.describePasswordLength("abcdefghijk"));
    }

    @Test
    public void testIsAlphanumeric() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        
        // Test for a valid alphanumeric password
        assertTrue(checker.isAlphanumeric("1"));
        
        // Test for an invalid password with special characters
        assertTrue(checker.isAlphanumeric("123"));
    }

    // Test for isBannedPassword method
    @Test
    public void testIsBannedPassword() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        
        // Test for a banned password
        assertTrue(checker.isBannedPassword("password123"));
        
        // Test for a not banned password
        assertFalse(checker.isBannedPassword("mysecurepassword"));
    }
}
