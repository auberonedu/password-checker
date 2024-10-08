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
