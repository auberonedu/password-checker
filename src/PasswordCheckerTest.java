import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthMedium() {
        // Assign
        PasswordChecker checker = new PasswordChecker(4, 6);
        // Act
        String actualLength = checker.describePasswordLength("ababa");
        // Assert
        assertEquals("medium", actualLength);
    }   
    @Test
    void testDescribePasswordLengthShort(){
        // Assign
        PasswordChecker checker = new PasswordChecker(4, 6);
        // Act
        String actualLength= checker.describePasswordLength("kma");
        // Assert
        assertEquals("short", actualLength);
    }

    @Test
    void testDescribePasswordLengthLong(){
        PasswordChecker checker = new PasswordChecker(4, 6);

        String actualLength = checker.describePasswordLength("longestentry");

        assertEquals("long", actualLength);
    }

    @Test
    void testIsAlphanumericTrue() {
        PasswordChecker checker = new PasswordChecker(5, 8);
        
        Boolean isAlphanumeric = checker.isAlphanumeric("abc789");

        assertEquals(true, isAlphanumeric);
    }

    @Test
    void testIsAlphanumericFalse(){
        PasswordChecker checker = new PasswordChecker(5, 8);

        Boolean isAlphanumeric = checker.isAlphanumeric("!!!!!!!!!");

        assertEquals(false, isAlphanumeric);
    }

    @Test
    void testIsBannedPassword() {

    }
}
