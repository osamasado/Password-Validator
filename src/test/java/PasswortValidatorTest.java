import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortValidatorTest {

    @Test
    void hasMinLength_shouldReturnFalse_whenCalledWithNull() {
        String pass = null;
        boolean actual = PasswortValidator.hasMinLength(pass, 8);
        assertFalse(actual);
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
}