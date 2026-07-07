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

        return false;
    }
    public static boolean containsUpperAndLower(String password) {
        return true;
    }
    public static boolean isCommonPassword(String password) {
        return true;
    }

    public static boolean containsSpecialChar(String password, String allowedChars) {
        return true;
    }

    public static boolean isValid(String password) {
        return true;
    }


}
