package com.theironyard;

/**
 * Created by austinhays on 5/24/16.
 */
public class Dog extends Mammal {
    public Dog() {
        this.name = "Dog";
    }
    @Override
    public void makesSound() {
        System.out.println("Bark");
    }
}
