import java.util.List;

public final class PasswortValidator {
    public static boolean hasMinLength(String password, int min) {

        if(isNullOrEmpty(password)) {
            return false;
        }
        return password.length() >= min;
    }

    public static boolean containsDigit(String password) {
        if(isNullOrEmpty(password)) {
            return false;
        }
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String digit : digits) {
            if(password.contains(digit)) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsUpperAndLower(String password) {
        if(isNullOrEmpty(password)) {
            return false;
        }
        char[] passwordChars = password.toCharArray();
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char chr : passwordChars) {
            if (Character.isUpperCase(chr)) {
                hasUpper = true;
            }
            else if (Character.isLowerCase(chr)) {
                hasLower = true;
            }
        }
        return hasUpper && hasLower;
    }
    public static boolean isCommonPassword(String password) {
        if(isNullOrEmpty(password)) {
            return true;
        }

        List<String> weakPasswords = List.of(
                "password",
                "Passwort1",
                "Aa345678",
                "123456",
                "12345678",
                "qwerty",
                "abc123",
                "password1",
                "admin",
                "letmein",
                "welcome",
                "iloveyou"
        );

        for(String pass : weakPasswords) {
            if(password.trim().toLowerCase().compareTo(pass.toLowerCase()) == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsSpecialChar(String password, String allowedChars) {
        char[] passwordChars = password.toCharArray();

        for (char chr : passwordChars) {
            if(allowedChars.contains(String.valueOf(chr))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(String password) {
        boolean isNullOrEmpty = isNullOrEmpty(password);
        boolean hasMinLength = hasMinLength(password, 8);
        boolean containsDigit = containsDigit(password);
        boolean containsUpperAndLower = containsUpperAndLower(password);
        boolean isCommonPassword = isCommonPassword(password);
        boolean containsSpecialChar = containsSpecialChar(password, "#$%&(){}*+");

        return !isNullOrEmpty && hasMinLength && containsDigit && containsUpperAndLower && !isCommonPassword && containsSpecialChar;
    }

    public static ValidationResult validatePassword(String password) {
        ValidationResult result = new ValidationResult();

        boolean isNullOrEmpty = isNullOrEmpty(password);
        if(isNullOrEmpty) {
            result.addReason("Password can not be null or empty.");
        }
        boolean hasMinLength = hasMinLength(password, 8);
        if(!hasMinLength) {
            result.addReason("Password must be at least " + 8 + " characters long.");
        }
        boolean containsDigit = containsDigit(password);
        if(!containsDigit) {
            result.addReason("Password must contain at least one digit.");
        }
        boolean containsUpperAndLower = containsUpperAndLower(password);
        if(!containsUpperAndLower) {
            result.addReason("Password must contain an uppercase and lowercase letter.");
        }
        boolean isCommonPassword = isCommonPassword(password);
        if(isCommonPassword) {
            result.addReason("Password is too weak!");
        }
        boolean containsSpecialChar = containsSpecialChar(password, "#$%&(){}*+");
        if(!containsSpecialChar) {
            result.addReason("Password must contain at least one special character form :" + "#$%&(){}*+");
        }

        return result;
    }


    public static boolean isNullOrEmpty(String password) {
        return password == null || password.isEmpty();
    }


}
