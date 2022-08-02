package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ApplicationTest {
    @Test
    public void testSetName(){
        //Given
        Dog dog = new Dog();
        dog.setName("weewee");
        //When
        String expected = "weewee";
        String actual = dog.getName();
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testGetName(){
        Cat cat = new Cat("mulva");
        String expected = "mulva";
        String actual = cat.getName();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSpeak(){
        Turtle turtle = new Turtle();
        String actual = turtle.getSpeak();

        Assert.assertEquals("Mweeerrrrrp", actual);
    }

    @Test
    public void testSort(){
        Pet[] allPets = new Pet[5];
        Dog dog1 = new Dog("Peter");
        Dog dog2 = new Dog("Paddy");
        Dog dog3 = new Dog("Arf");
        Dog dog4 = new Dog("Bob");
        Dog dog5 = new Dog("DingDong");
        allPets[0] = dog1;
        allPets[1] = dog2;
        allPets[2] = dog3;
        allPets[3] = dog4;
        allPets[4] = dog5;

        Arrays.sort(allPets);
        Pet[] sortedPets = new Pet[]{dog3, dog4, dog5, dog2, dog1};
        Dog actual = dog4;

        Assert.assertEquals(actual, allPets[1]);
    }

}