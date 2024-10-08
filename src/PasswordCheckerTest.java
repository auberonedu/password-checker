import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  @Test
  void testDescribePasswordLengthShort() {
    // Arrange
    PasswordChecker shortPassword = new PasswordChecker(6, 12);
    // Act
    String actualLength = shortPassword.describePasswordLength("abcde");
    // Assert
    assertEquals("short", actualLength);
  }

  @Test
  void testDescribePasswordLengthMedium() {
    // Arrange
    PasswordChecker mediumPassword = new PasswordChecker(6, 12);
    // Act
    String actualLength = mediumPassword.describePasswordLength("abc123abc");
    // Assert
    assertEquals("medium", actualLength);
  }

  @Test
  void testDescribePasswordLengthLong() {
    // Arrange
    PasswordChecker longPassword = new PasswordChecker(6, 12);
    // Act
    String actualLength = longPassword.describePasswordLength("abc123abcdefghijklmnop");
    // Assert
    assertEquals("long", actualLength);
  }

  @Test
  void testIsAlphanumericNumbers() {
    // Arrange
    PasswordChecker numberPassword = new PasswordChecker(6, 12);
    // Act
    Boolean answer = numberPassword.isAlphanumeric("1123541");
    // Assert
    assertEquals(true, answer);
  }

  @Test
  void testIsAlphanumericLetters() {
    // Arrange
    PasswordChecker letterPassword = new PasswordChecker(6, 12);
    // Act
    Boolean answer = letterPassword.isAlphanumeric("abcdefghijk");
    // Assert
    assertEquals(true, answer);
  }

  @Test
  void testIsBannedPassword() {

  }
}
