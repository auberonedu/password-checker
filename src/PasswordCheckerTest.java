import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(6,12);

        String password = checker.describePasswordLength("Four");



    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
