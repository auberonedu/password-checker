import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertEquals("short", checker.describePasswordLength("abc"), "Password should be classified as short.");

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

