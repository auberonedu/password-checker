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
    void testDescribePasswordLengthLong() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(1, 3);
        //Act
        String length = checker.describePasswordLength("Onomatopoeia");
        //Assert
        assertEquals("long", length);
    }

    @Test
    void testIsAlphanumericNumbers() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        boolean isCharacter = checker.isAlphanumeric("1111111");
        //Assert
        assertEquals(true, isCharacter);
    }

    @Test
    void testIsAlphanumericMixed() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        boolean isCharacter = checker.isAlphanumeric("abcd1234");
        //Assert
        assertEquals(true, isCharacter);
    }

    @Test
    void testIsAlphanumericAlternates() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        boolean isCharacter = checker.isAlphanumeric("a@##@*&%(#)(*&^%%$^)");
        //Assert
        assertEquals(false, isCharacter);
    }

    @Test
    void testIsBannedPasswordNotBanned() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        boolean isBanned = checker.isBannedPassword("tomato");
        //Assert
        assertEquals(false, isBanned);
    }

    @Test
    void testIsBannedPasswordBanned() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        boolean isBanned = checker.isBannedPassword("password");
        //Assert
        assertEquals(true, isBanned);
    }

    @Test
    void testIsBannedPasswordContained() {
        //Arrange
        PasswordChecker checker = new PasswordChecker(5, 8);
        //Act
        boolean isBanned = checker.isBannedPassword("tiaqwertymarie");
        //Assert
        assertEquals(false, isBanned);
    }
}
