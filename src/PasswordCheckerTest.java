import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthTooLong() {
    // Arrange
    PasswordChecker checkLength = new PasswordChecker(6, 13);
    // Act
    String actualDescription = checkLength.describePasswordLength("hellooooooooo");
    // Assert
    assertEquals("long", actualDescription);
    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
