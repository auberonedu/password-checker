import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthMedium() {
        // Arrange
        PasswordChecker password = new PasswordChecker(5, 10);
        // Act
        String actualLength = password.describePasswordLength("batman");
        // Assert
        assertEquals("medium", actualLength);
    }
    
    @Test
    void testDescribePasswordLengthShort() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 6);
        // Act
        String actualLength = password.describePasswordLength("egg");
        // Assert
        assertEquals("short", actualLength);
    }
    
    @Test
    void testDescribePasswordLengthLong() {
        // Arrange
        PasswordChecker password = new PasswordChecker(12, 20);
        // Act
        String actualLength = password.describePasswordLength("ToyotaSupraCoolestCarTurbo");
        // Assert
        assertEquals("long", actualLength);
    }

    @Test
    void testIsAlphanumericLetter() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 12);
        // Act
        boolean actualLetter = password.isAlphanumeric("CAR");
        // Assert
        assertEquals(true, actualLetter);
    }

    @Test
    void testIsAlphanumericDigit() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 12);
        // Act
        boolean actualDigit = password.isAlphanumeric("1232932");
        // Assert
        assertEquals(true, actualDigit);
    }

    @Test
    void testIsAlphanumericSpecial() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 12);
        // Act
        boolean actualSpecial = password.isAlphanumeric("@%^&**");
        // Assert
        assertEquals(false, actualSpecial);
    }

    @Test
    void testIsBannedPassword1() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 12);
        // Act
        boolean actualBanned = password.isBannedPassword("hello");
        // Assert
        assertEquals(true, actualBanned);
    }
    @Test
    void testIsBannedPassword2() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 12);
        // Act
        boolean actualBanned = password.isBannedPassword("audhiasuh");
        // Assert
        assertEquals(false, actualBanned);
    }
    @Test
    void testIsBannedPassword3() {
        // Arrange
        PasswordChecker password = new PasswordChecker(6, 12);
        // Act
        boolean actualBanned = password.isBannedPassword("&*^*&^*&");
        // Assert
        assertEquals(false, actualBanned);
    }
}
