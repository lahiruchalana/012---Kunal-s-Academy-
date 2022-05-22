package com.lahiru.inheritance;

public class BoxProduct extends BoxWeight{
     String product_name;

    public BoxProduct () {
        this.product_name = "gift box";
    }

    public BoxProduct(long height, long width, long length, long weight, long widthSuper, String product_name) {
        super(height, width, length, weight, widthSuper);
        this.product_name = product_name;
    }

    public BoxProduct(BoxWeight object, String product_name) {
        super(object);
        this.product_name = product_name;
    }
}
