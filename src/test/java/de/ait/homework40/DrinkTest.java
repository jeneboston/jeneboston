package de.ait.homework40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @Test
    void getName() {
        Drink drink = new Drink("Beer", "alcohol", 500);
        Assertions.assertEquals("Beer", drink.getName());
    }

    @Test
    void getType() {
    }

    @Test
    void getVolume() {
    }

    @Test
    void setVolume() {
    }
}