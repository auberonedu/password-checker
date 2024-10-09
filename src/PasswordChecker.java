import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class PasswordChecker {
    private int shortThreshold;
    private int mediumThreshold;
    private Set<String> bannedPasswords;

    public PasswordChecker(int shortThreshold, int mediumThreshold, Set<String> customBannedPasswords) {
        this.shortThreshold = shortThreshold;
        this.mediumThreshold = mediumThreshold;
        this.bannedPasswords = getDefaultBannedPasswords();
        this.bannedPasswords.addAll(customBannedPasswords);
    }

    public PasswordChecker(int shortThreshold, int mediumThreshold) {
        this(shortThreshold, mediumThreshold, new HashSet<>());
    }

    public String describePasswordLength(String password) {
        int length = password.length();
        if (length < shortThreshold) {
            return "short";
        } else if (length < mediumThreshold) {
            return "medium";
        }
        return "long";
    }

    public boolean isAlphanumeric(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isBannedPassword(String password) {
        return bannedPasswords.contains(password.toLowerCase());
    }

    private Set<String> getDefaultBannedPasswords() {
        return new HashSet<>(Arrays.asList(
            "password123", "123456", "qwerty", "letmein", "password", "hello"
        ));
    }
}
