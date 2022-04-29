package ru.netology.geo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {
    private GeoServiceImpl geoService;

    @BeforeEach
    void createGeoService() {
        geoService = new GeoServiceImpl();
    }

    @Test
    void byIpShouldReturnLocationMoscowAndStreetLenina() {
        Location expectLocation = geoService.byIp("172.0.32.11");

        Location actualLocation = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        assertEquals(expectLocation, actualLocation);
    }


    @Test(expected = RuntimeException.class)
    void byCoordinates() throws RuntimeException {
        geoService.byCoordinates(2342.3, 134.2);
    }
}