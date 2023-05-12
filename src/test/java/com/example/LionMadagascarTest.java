package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class LionMadagascarTest {
    @Test
    public void testGetKittens() throws Exception {
        Feline feline = new Feline();
        LionMadagascar lionMadagascar = new LionMadagascar(feline);
        assertEquals(0, lionMadagascar.getKittens());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Feline feline = new Feline();
        LionMadagascar lionMadagascar = new LionMadagascar(feline);
        assertEquals("Нью-Йоркский зоопарк", lionMadagascar.getPlaceOfLiving());
    }

    @Test
    public void testGetFriends() throws Exception{
        Feline feline = new Feline();
        LionMadagascar lionMadagascar = new LionMadagascar(feline);
        assertEquals(List.of("Марти, Глория, Мелмон"), lionMadagascar.getFriends());
    }
}
