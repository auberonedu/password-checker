import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

    // Test for short passwords
    @Test
    void testDescribePasswordLength_Short() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertEquals("short", checker.describePasswordLength("abc"), "Password should be classified as short.");
    }

    // Test for medium-length passwords
    @Test
    void testDescribePasswordLength_Medium() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertEquals("medium", checker.describePasswordLength("abcdef"), "Password should be classified as medium.");
    }

    // Test for long passwords
    @Test
    void testDescribePasswordLength_Long() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertEquals("long", checker.describePasswordLength("abcdefghijklmnop"), "Password should be classified as long.");
    }

    // Test for alphanumeric password
    @Test
    void testIsAlphanumeric() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertTrue(checker.isAlphanumeric("abc123"), "Password should be alphanumeric.");
    }

     // Test for non-alphanumeric password (should contain special characters)
    @Test
    void testIsAlphanumeric_Invalid() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertFalse(checker.isAlphanumeric("abc123!"), "Password should not be alphanumeric if it contains special characters.");
    }

    // Test for empty password (empty string)
    @Test
    void testIsAlphanumeric_Empty() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertTrue(checker.isAlphanumeric(""), "Empty password should be considered alphanumeric.");
    }

    // Test for banned password
    @Test
    void testIsBannedPassword() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertTrue(checker.isBannedPassword("password123"), "Password should be banned.");
    }

    // Test for not banned password
    @Test
    void testIsBannedPassword_NotBanned() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertFalse(checker.isBannedPassword("uniquePassword"), "Password should not be banned.");
    }

    // Test for case-insensitive banned password check
    @Test
    void testIsBannedPassword_CaseInsensitive() {
        PasswordChecker checker = new PasswordChecker(6, 12);
        assertTrue(checker.isBannedPassword("PASSWORD123"), "Password banning should be case-insensitive.");
    }
}
