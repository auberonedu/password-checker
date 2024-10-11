import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        PasswordChecker checkLength = new PasswordChecker(6, 10);
        checkLength.describePasswordLength("password");
        checkLength.describePasswordLength("SuperMarioWowie!");
        checkLength.describePasswordLength("Hi!");
        assertEquals("medium", checkLength.describePasswordLength("password"));
        assertEquals("long", checkLength.describePasswordLength("SuperMarioWowie!"));
        assertEquals("short", checkLength.describePasswordLength("Hi!"));
    }

    @Test
    void testIsAlphanumeric() {
        PasswordChecker checkAlphaNum = new PasswordChecker(6, 10);
        checkAlphaNum.isAlphanumeric("password");
        checkAlphaNum.isAlphanumeric("SuperMarioWowie!");
        checkAlphaNum.isAlphanumeric("Hi!");
        assertEquals(true, checkAlphaNum.isAlphanumeric("password"));
        assertEquals(false, checkAlphaNum.isAlphanumeric("SuperMario!Wowie!"));
        assertEquals(false, checkAlphaNum.isAlphanumeric("Hi!"));
    }

    @Test
    void testIsBannedPassword() {
        PasswordChecker checkBan = new PasswordChecker(6, 10, new HashSet<>(Arrays.asList("password123", "123456", "qwerty", "letmein", "password", "hello")));
        checkBan.isBannedPassword("123456");
        assertEquals(true, checkBan.isBannedPassword("123456"));
        checkBan.isBannedPassword("SuperMarioWowie");
        assertEquals(false, checkBan.isBannedPassword("SuperMarioWowie"));
    }
}
