package com.masglobalconsulting.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircusTest {

    @Test
    void createCircus(){
        Circus circus = new Circus();
        Assertions.assertNotNull(circus);
    }

    @Test
    void MakeSoundCat(){
        Cat cat = new Cat();
        Assertions.assertNotNull(cat);
        Assertions.assertEquals("Meow", cat.getSoundCat());
        Assertions.assertEquals("Micka", cat.getName());
    }

    @Test
    void MakeSoundDog(){
        Dog dog = new Dog();
        Assertions.assertNotNull(dog);
        Assertions.assertEquals("Woof", dog.getSoundDog());
        Assertions.assertEquals("Bob", dog.getName());
    }
}
