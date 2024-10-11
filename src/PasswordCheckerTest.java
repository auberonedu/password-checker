import static org.junit.Assert.assertEquals;

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
        assertEquals(false, checkAlphaNum.isAlphanumeric("SuperMarioWowie!"));
        assertEquals(false, checkAlphaNum.isAlphanumeric("Hi!"));
    }

    @Test
    void testIsBannedPassword() {

    }
}
