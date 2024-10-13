import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthShort() {
        //Arrange
        PasswordChecker isPasswordShort = new PasswordChecker(5, 10);
       
        //Action
        String shortpassword = isPasswordShort.describePasswordLength("Luv");
        //Assertion 
        assertEquals("short", shortpassword);
        
    }
    @Test
    void testDescribePasswordLengthMedium() {

        PasswordChecker isPasswordShort = new PasswordChecker(5, 10);
       
        //Action
        String mediumpassword = isPasswordShort.describePasswordLength("Luvstuck");
        //Assertion 
        assertEquals("medium", mediumpassword);
        
    }

    @Test
    void testDescribePasswordLengthLong() {
        PasswordChecker isPasswordShort = new PasswordChecker(5, 10);
       
        //Action
        String longpassword = isPasswordShort.describePasswordLength("Luvstuck4you");
        //Assertion 
        assertEquals("long", longpassword);

    }

    @Test
    void testIsAlphanumericSpecialChar() {
        //Arrange
        PasswordChecker isAlphaNumberic = new PasswordChecker(6, 12);
        //Action
        boolean alphaNumericTF = isAlphaNumberic.isAlphanumeric("############");
        //Assertion
        assertEquals(false, alphaNumericTF);
    }

    @Test
    void testIsAlphanumeric() {
        //Arrange
        PasswordChecker isAlphaNumberic = new PasswordChecker(6, 12);
        //Action
        boolean alphaNumericTF = isAlphaNumberic.isAlphanumeric("TestTest2024");
        //Assertion
        assertEquals(true, alphaNumericTF);
    }

    @Test
    void testIsAlphanumericMixed() {
        //Arrange
        PasswordChecker isAlphaNumberic = new PasswordChecker(6, 12);
        //Action
        boolean alphaNumericTF = isAlphaNumberic.isAlphanumeric("%^GoGators24!");
        //Assertion
        assertEquals(false, alphaNumericTF);
    }

    @Test
    void testIsBannedPasswordpassword123() {

        //Arrange
        PasswordChecker banned = new PasswordChecker(6, 12);
        //Action
        boolean passwordTF = banned.isBannedPassword("password123");
        //Assertion
        assertEquals(true, passwordTF);

    }

    @Test
    void testIsBannedPassword123456() {

        //Arrange
        PasswordChecker banned = new PasswordChecker(6, 12);
        //Action
        boolean passwordTF = banned.isBannedPassword("123456");
        //Assertion
        assertEquals(true, passwordTF);

    }

    @Test
    void testIsBannedPasswordqwerty() {

        //Arrange
        PasswordChecker banned = new PasswordChecker(6, 12);
        //Action
        boolean passwordTF = banned.isBannedPassword("qwerty");
        //Assertion
        assertEquals(true, passwordTF);

    }

    @Test
    void testIsBannedPasswordletmein() {

        //Arrange
        PasswordChecker banned = new PasswordChecker(6, 12);
        //Action
        boolean passwordTF = banned.isBannedPassword("letmein");
        //Assertion
        assertEquals(true, passwordTF);

    }

    @Test
    void testIsBannedPasswordpassword() {

        //Arrange
        PasswordChecker banned = new PasswordChecker(6, 12);
        //Action
        boolean passwordTF = banned.isBannedPassword("password");
        //Assertion
        assertEquals(true, passwordTF);

    }

    @Test
    void testIsBannedPasswordhello() {

        //Arrange
        PasswordChecker banned = new PasswordChecker(6, 12);
        //Action
        boolean passwordTF = banned.isBannedPassword("hello");
        //Assertion
        assertEquals(true, passwordTF);

    }
    
}
