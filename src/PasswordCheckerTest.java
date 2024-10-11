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
    void testIsAlphanumericCorrect() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isAlphanumeric("abcde12345");

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testIsAlphanumericFalse() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isAlphanumeric("abcde1!@45");

        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testIsAlphanumericFinalCharacterRecognition() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isAlphanumeric("abcde123!");

        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testIsBannedPasswordTrue() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isBannedPassword("password");

        // Assert
        assertEquals(true, actual);

    }

    @Test
    void testIsBannedPasswordFalse() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isBannedPassword("word12pass");

        // Assert
        assertEquals(false, actual);

    }

    @Test
    void testIsBannedPasswordUpperCaseAllowed() {
        // Arrange
        PasswordChecker input = new PasswordChecker(6, 12);

        // Act
        boolean actual = input.isBannedPassword("PASS12word");

        // Assert
        assertEquals(false, actual);

    }

}
