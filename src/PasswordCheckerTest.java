import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthTooShort() {
        // Arrange
        PasswordChecker length = new PasswordChecker(6, 12);

        // Act
        String actual = length.describePasswordLength("a");

        // Assert
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthMedium() {
        // Arrange
        PasswordChecker length = new PasswordChecker(6, 12);

        // Act
        String actual = length.describePasswordLength("abcdefgh");

        // Assert
        assertEquals("medium", actual);

    }

    @Test
    void testDescribePasswordLengthLong() {
        // Arrange
        PasswordChecker length = new PasswordChecker(6, 12);

        // Act
        String actual = length.describePasswordLength("asdfjklqwertyu");

        // Assert
        assertEquals("long", actual);

    }

    @Test
    void testIsAlphanumeric() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isAlphanumeric("abcde12345");

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testIsBannedPassword() {

    }
}
