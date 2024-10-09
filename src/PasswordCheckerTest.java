import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength_Short() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertEquals("short", checker.describePasswordLength("abc"), "Password should be classified as short.");

    }

    @Test
    void testDescribePasswordLength_Medium() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertEquals("medium", checker.describePasswordLength("abcdef"), "Password should be classified as medium.");
    
    }

    @Test
    void testIsAlphanumeric() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertTrue(checker.isAlphanumeric("abc123"), "Password should be alphanumeric.");

    }

    @Test
    void testIsBannedPassword() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertTrue(checker.isBannedPassword("password123"), "Password should be banned.");
    }    
}

