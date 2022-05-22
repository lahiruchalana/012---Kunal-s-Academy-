package com.lahiru.inheritance;

public class BoxWeight extends Box {

    long weight;
//    long width;

    BoxWeight () {
        this.weight = 1;
        // will assign Box() constructor values in Box class file
    }

    public BoxWeight(long height, long width, long length, long weight, long widthSuper) {
        super(height, width, length);

        this.width = widthSuper;
        // when there is properties with same names in super class and the child class
        // then use this.property for child class
        System.out.println(this.width);


        // and use super.property for super class
        System.out.println(super.width);

        this.weight = weight;

    }

    BoxWeight (BoxWeight object) {
        super(object);
        this.weight = object.weight;
    }
}
