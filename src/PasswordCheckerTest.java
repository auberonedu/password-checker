import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthShort() {

    }
    @Test
    void testDescribePasswordLengthMedium() {

    }

    @Test
    void testDescribePasswordLengthLong() {

    }

    @Test
    void testIsAlphanumeric() {

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
