import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLength() {
        PasswordChecker checker = new PasswordChecker(5, 8);
        String length = checker.describePasswordLength("James");
    }

    @Test
    void testIsAlphanumeric() {

    }

    @Test
    void testIsBannedPassword() {

    }
}
