import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortValidatorTest {

    // =========== hasMinLength() ===========================
    @Test
    void hasMinLength_shouldReturnFalse_whenCalledWithNull() {
        assertFalse(PasswortValidator.hasMinLength(null, 8));
    }

    @Test
    void hasMinLength_shouldReturnFalse_whenCalledWithEmptyString() {
        String pass = "";
        boolean actual = PasswortValidator.hasMinLength(pass, 8);
        assertFalse(actual);
    }

    @Test
    void hasMinLength_shouldReturnFalse_whenCalledWithStringLength7() {
        String pass = "1234567";
        boolean actual = PasswortValidator.hasMinLength(pass, 8);
        assertFalse(actual);
    }

    @Test
    void hasMinLength_shouldReturnTrue_whenCalledWithStringLength8() {
        String pass = "12345678";
        boolean actual = PasswortValidator.hasMinLength(pass, 8);
        assertTrue(actual);
    }

    @Test
    void hasMinLength_shouldReturnTrue_whenCalledWithStringLength9() {
        String pass = "123456789";
        boolean actual = PasswortValidator.hasMinLength(pass, 8);
        assertTrue(actual);
    }

    // =========== containsDigit() ===========================
    @Test
    void containsDigit_shouldReturnFalse_whenCalledWithNull() {
        assertFalse(PasswortValidator.containsDigit(null));
    }

    @Test
    void containsDigit_shouldReturnFalse_whenCalledWithEmptyString() {
        String pass = "";
        boolean actual = PasswortValidator.containsDigit(pass);
        assertFalse(actual);
    }

    @Test
    void containsDigit_shouldReturnTrue_whenCalledWithOneDigit() {
        String pass = "1";
        boolean actual = PasswortValidator.containsDigit(pass);
        assertTrue(actual);
    }

    @Test
    void containsDigit_shouldReturnFalse_whenCalledWithNoDigit() {
        String pass = "osama";
        boolean actual = PasswortValidator.containsDigit(pass);
        assertFalse(actual);
    }

}