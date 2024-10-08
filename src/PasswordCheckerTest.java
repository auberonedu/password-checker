import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthShort() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(2, 7);
        // Act
        String actual = checker.describePasswordLength("a");
        // Assert
        assertEquals("short", actual);
    }

 
    @Test 
    void testDescribePasswordLengthLong() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(2, 7);
        // Act 
        String actual = checker.describePasswordLength("alongpassword");
        // Assert
        assertEquals("long", actual);
    }
    @Test
    void testDescribePasswordLengthMedium() {
        PasswordChecker checker = new PasswordChecker(2, 7);
        // Act
        String actual = checker.describePasswordLength("abcd");
        // Assert
        assertEquals("medium", actual);
    }

    @Test
    void testIsAlphanumeric() {

        // Check:
        // !!!!! -r
        // 12345 -a
        // "    " -r
        // turtles -a

    }

    @Test
    void testIsBannedPassword() {

        // check
        // 123456 -r
        // QWERTY -a
        // MANGO -r

    }
}
