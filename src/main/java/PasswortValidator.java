public final class PasswortValidator {
    public static boolean hasMinLength(String password, int min) {

        if(password == null || password.isEmpty()) {
            return false;
        }
        return password.length() >= min;
    }

    public static boolean containsDigit(String password) {
        if(password == null || password.isEmpty()) {
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
        if(password == null || password.isEmpty()) {
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
        if(password == null || password.isEmpty()) {
            return false;
        }
        return false;
    }

    public static boolean containsSpecialChar(String password, String allowedChars) {
        return true;
    }

    public static boolean isValid(String password) {
        return true;
    }


}
