import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        PasswordChecker checkLength = new PasswordChecker(6, 10);
        checkLength.describePasswordLength("password");
        assertEquals("medium", checkLength.describePasswordLength("password"));
        checkLength.describePasswordLength("SuperMarioWowie!");
        assertEquals("long", checkLength.describePasswordLength("SuperMarioWowie!"));
        checkLength.describePasswordLength("Hi!");
        assertEquals("short", checkLength.describePasswordLength("Hi!"));
    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
