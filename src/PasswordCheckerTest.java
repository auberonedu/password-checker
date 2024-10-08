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
  void testIsAlphanumeric() {

  }

  @Test
  void testIsBannedPassword() {

  }
}
