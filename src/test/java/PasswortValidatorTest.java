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
}