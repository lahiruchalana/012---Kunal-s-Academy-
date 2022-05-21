package com.lahiru.inheritance;

public class Box {

    long height;
    long width;
    long length;

    Box () {
        this.height = 1;
        this.length = 1;
        this.width = 1;
    }

    public Box(long height, long width, long length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
