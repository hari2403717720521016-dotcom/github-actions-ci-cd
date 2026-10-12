package com.cmls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void shouldReturnExpectedMessage() {
        assertEquals(
            "CMLS Java application is running!",
            App.getMessage()
        );
    }

    @Test
    void messageShouldNotBeEmpty() {
        org.junit.jupiter.api.Assertions.assertFalse(
            App.getMessage().isBlank()
        );
    }
}
