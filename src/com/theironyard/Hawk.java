package com.theironyard;

/**
 * Created by austinhays on 5/24/16.
 */
public class Hawk extends Bird {
    public Hawk() {
        this.name = "Hawk";
    }
    @Override
    public void makesSound() {
        System.out.println("Cawww");
    }
}
