package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

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

}