package io.zipcoder;

import java.lang.Comparable;
import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet> {
    String speak;
    String name;
    String type;

    public Pet() {
        this.name = "";
        this.speak = "";
        this.type = "Pet";
    }
    @Override
    public String toString(){
        String studentString =  "Pet Name: " + getName() + "\n" +
                "> Pet Type: " + getType() + "\n" +
                "> Pet Sound:" + getSpeak();
        return studentString;}

    //SETTERS
    public void setName(String name) {this.name = name;}
    public void setSpeak(String speak) {this.speak = speak;}
    public void setType(String type) {this.type = type;}

    //GETTERS
    public String getName() {return this.name;}
    public String getSpeak() {return this.speak;}
    public String getType() {return this.type;}

    @Override
    public int compareTo(Pet p){
        return this.name.compareTo(p.name);
    }

    @Override
    public int compare(Pet o1, Pet o2) {
        return o2.compareTo(o1);
    }
}