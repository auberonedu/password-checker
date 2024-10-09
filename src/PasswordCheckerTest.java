import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthMedium() {
    //Arrange
    PasswordChecker checker = new PasswordChecker(5, 8);
    //Act
    String length = checker.describePasswordLength("James");
    //Assert
    assertEquals("medium", length);
    }

    @Test
    void testDescribePasswordLengthShort() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        String length = checker.describePasswordLength("Bot");
        //Assert
        assertEquals("short", length);
    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
