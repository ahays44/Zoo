package com.theironyard;

/**
 * Created by austinhays on 5/24/16.
 */
public class Snake extends Reptile {
    public Snake() {
        this.name = "Snake";
    }
    @Override
    public void makesSound() {
        System.out.println("ssssssss");
    }
}
