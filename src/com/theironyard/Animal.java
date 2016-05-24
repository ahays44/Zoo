package com.theironyard;

/**
 * Created by austinhays on 5/24/16.
 */
public class Animal {
    String name;

    public void makesSound() {
        System.out.println("Animal Sound!!!");
    }

    @Override
    public String toString() {
        return name;
    }
}

