package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Predator predator;

    @Test
    public void isTheNameOfTheFamilyFelineTrue() {
        Feline feline = new Feline();
        String actualFamily = "Кошачьи";
        assertEquals(feline.getFamily(), actualFamily);
    }

    @Test
    public void isFelineMeatEatersTrue() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void haveFelineOneKittenTrue() {
        Feline feline = new Feline();
        int actual = 1;
        assertEquals(feline.getKittens(), actual);
    }
}
