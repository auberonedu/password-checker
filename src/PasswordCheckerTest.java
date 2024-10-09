import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    // TEST 1
    @Test
    void testMediumPasswordLength() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(5, 6);
        
        // Act 
        String describePasswordLength = checker.describePasswordLength("hello");
        
        // Assert 
        assertEquals("medium", describePasswordLength);
    }

    // TEST 2
    @Test 
    void testLongPasswordLength() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(5, 10);
        
        // Act 
        String describePasswordLength = checker.describePasswordLength("superlongrandompassword");
        
        // Assert 
        assertEquals("long", describePasswordLength);
    }

    //TEST 3
    @Test
    void testMinPasswordLength() {
        //Arrange
        //below the min characters, 6 is the min, but 5 characters is entered 
        PasswordChecker checker = new PasswordChecker(6, 10);
        //Act
        String describePasswordLength = checker.describePasswordLength("hello");

        //Assert
        assertEquals("short", describePasswordLength);
    }


    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
