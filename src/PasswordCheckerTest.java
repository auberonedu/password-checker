import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthTooLong() {
    // Arrange
    PasswordChecker checkLength = new PasswordChecker(3, 6);
    // Act
    String actualDescription = checkLength.describePasswordLength("hellooooooooo");
    // Assert
    assertEquals("long", actualDescription);
    }

    @Test
    void testDescribePasswordLengthTooShort() {
    // Arrange
    PasswordChecker checkLength = new PasswordChecker(3, 6);
    // Act
    String actualDescription = checkLength.describePasswordLength("hi");
    // Assert
    assertEquals("short", actualDescription);
    }

    @Test
    void testDescribePasswordLengthMedium() {
    // Arrange
    PasswordChecker checkLength = new PasswordChecker(3, 6);
    // Act
    String actualDescription = checkLength.describePasswordLength("hiiii");
    // Assert
    assertEquals("medium", actualDescription);
    }

    @Test
    void testIsAlphanumeric() {
    // Arrange
    PasswordChecker alphanumeric = new PasswordChecker(5, 10);
    // Act
    boolean actualDescription = alphanumeric.isAlphanumeric("Heythere");
    // Assert
    assertEquals(true, actualDescription);
    }

     @Test
     void testIsNotAlphanumeric() {
        // Arrange
        PasswordChecker alphanumeric = new PasswordChecker(5, 10);
        // Act
        boolean actualDescription = alphanumeric.isAlphanumeric("%%%");
        // Assert
        assertEquals(false, actualDescription);
    }

    @Test
    void testIsAlphanumericNumbers() {
    // Arrange
    PasswordChecker alphanumeric = new PasswordChecker(5, 10);
    // Act
    boolean actualDescription = alphanumeric.isAlphanumeric("11111");
    // Assert
    assertEquals(true, actualDescription);
    }

    @Test
    void testIsBannedPassword() {
        // Arrange
        PasswordChecker isBanned = new PasswordChecker(5, 13);
        // Act
        boolean actualDescription = isBanned.isBannedPassword("password123");
        // Assert
        assertEquals(true, actualDescription);
    }

    @Test
    void testGetDefaultBannedPasswordsBanned(){
        // Arrange
        PasswordChecker banned = new PasswordChecker(3, 11);
        // Act
        boolean actualDescription = banned.isBannedPassword("Wassap");
        // Assert
        assertEquals(false, actualDescription);
    }

    @Test
    void testGetDefaultBannedPasswords(){
        // Arrange
        PasswordChecker banned = new PasswordChecker(3, 11);
        // Act
        boolean actualDescription = banned.isBannedPassword("password123");
        // Assert
        assertEquals(true, actualDescription);
    }
}
