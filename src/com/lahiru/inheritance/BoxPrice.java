package com.lahiru.inheritance;

public class BoxPrice extends BoxWeight{

    double price;

    BoxPrice () {
        super();
        this.price = 100;
    }

    public BoxPrice(long height, long width, long length, long weight, long widthSuper, double price) {
        super(height, width, length, weight, widthSuper);
        this.price = price;
    }

    public BoxPrice(BoxWeight object, double price) {
        super(object);
        this.price = price;
    }
}
