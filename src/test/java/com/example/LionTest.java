package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionTest {

    @Mock
    Feline feline;

    SexAndMane data;

    public LionTest(SexAndMane data) {
        this.data = data;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static SexAndMane[] getSex() {
        return new SexAndMane[] {
                new SexAndMane("Самец", true),
                new SexAndMane("Самка", false)
        };
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(10);
        assertEquals(10, lion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, data.getSex());
        assertEquals(data.isMane(), lion.doesHaveMane());
    }

    @Test
    public void testConstructorThrows() {
        Throwable thrown = assertThrows(Exception.class, () -> new Lion(feline, ""));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Птицы"));
        assertEquals(List.of("Птицы"), lion.getFood());
    }
}
