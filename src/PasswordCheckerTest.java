import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthTooShort() {
        //Arrange
        PasswordChecker length = new PasswordChecker(6, 12);

        //Act
        String actual = length.describePasswordLength("a");

        //Assert
        assertEquals("short", actual);

    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
