import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        // Assign
        PasswordChecker checker = new PasswordChecker(4, 6);
        // Act
        String actualLength = checker.describePasswordLength("ababa");
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
