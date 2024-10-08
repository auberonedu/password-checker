import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
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
  void testIsAlphanumeric() {

  }

  @Test
  void testIsBannedPassword() {

  }
}
