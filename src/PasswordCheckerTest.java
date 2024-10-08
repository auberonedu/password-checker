import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        // Arrange
        PasswordChecker password = new PasswordChecker(5, 10);
        // Act
        String actualLength = password.describePasswordLength("batman");
        // Assert
        assertEquals("medium", actualLength);
    }

    @Test
    void testIsAlphanumeric() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void testIsBannedPassword() {
        // Arrange

        // Act

        // Assert
    }
}
