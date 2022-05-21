package com.lahiru.inheritance;

public class BoxWeight extends Box {

    long weight;

    BoxWeight () {
        this.weight = 1;
        // will assign Box() constructor values in Box class file
    }

    public BoxWeight(long height, long width, long length, long weight) {
        super(height, width, length);
        this.weight = weight;
    }
}
