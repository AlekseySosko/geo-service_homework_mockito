package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {


    @Test
    void localShouldReturnEnglishText() {
        String expected = new LocalizationServiceImpl().locale(Country.USA);

        assertEquals(expected, "Welcome");
    }
}