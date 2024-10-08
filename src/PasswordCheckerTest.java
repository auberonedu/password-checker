import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthOne() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 6);
        
        //Act 
        String describePasswordLength = checker.describePasswordLength("hello");
        
        //Assert 
        assertEquals("medium", describePasswordLength);
    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
