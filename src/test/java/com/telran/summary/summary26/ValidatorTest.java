package com.telran.summary.summary26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    Validator validator = new Validator();

    @Test
    public void testValidateWithCorrectData() {
        Student alex = new Student("Alex", "something@some.ge", 34, "Schiller 89");
        assertDoesNotThrow(() -> validator.validate(alex));
    }

    @Test
    public void testValidateNullException() {
        Student alex = new Student("Alex", null, 34, "Schiller 89");
        assertThrows(ValidateException.class, () -> validator.validate(alex));
    }

    @Test
    public void testValidateEmptyException() {
        Student alex = new Student("Alex", "", 34, "Schiller 89");
        assertThrows(ValidateException.class, () -> validator.validate(alex));
    }
}