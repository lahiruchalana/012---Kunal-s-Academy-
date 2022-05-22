package com.lahiru.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(3,5,8);

//        BoxWeight box1 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(3, 5, 4, 7, 11);


        // in this case // can not access box1.weight
        Box box1 = new BoxWeight(12, 23, 13, 45, 44);

        BoxWeight box2 = new BoxWeight(box3);

//        System.out.println(box1.height + "   " + box1.width + "   " + box1.length + "   "); // can not access box1.weight
        System.out.println(box2.height + "   " + box2.width + "   " + box2.length + "   " + box2.weight);


    }
}
