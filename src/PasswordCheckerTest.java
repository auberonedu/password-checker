import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
       // Arrange
       PasswordChecker checker = new PasswordChecker(6, 12);
        
       // Act
       String result1 = checker.describePasswordLength("Four"); // short 4 
       String result2 = checker.describePasswordLength("123456");  //medium 6
       String result3 = checker.describePasswordLength("CodingIsFun!!!"); // long 13

       // Assert
       assertEquals("short", result1);    
       assertEquals("medium", result2);  
       assertEquals("long", result3);    



    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
