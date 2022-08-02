package io.zipcoder;

import java.lang.Comparable;
import java.util.Comparator;

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
