package io.zipcoder;

public class Dog extends Pet {

    public Dog () {
        this.name = "";
        this.speak = "Woof!";
        this.type = "dog";
    }
    public Dog (String name){
        this.name = name;
        this.speak = "Woof!";
        this.type = "dog";
    }
}