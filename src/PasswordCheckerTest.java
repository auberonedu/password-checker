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
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
