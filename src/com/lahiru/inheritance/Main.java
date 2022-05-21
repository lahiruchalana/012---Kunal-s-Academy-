package com.lahiru.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(3,5,8);

        BoxWeight box1 = new BoxWeight();
        BoxWeight box2 = new BoxWeight(3, 5, 4, 7);

        System.out.println(box1.height + "   " + box1.width + "   " + box1.length + "   " + box1.weight);
        System.out.println(box2.height + "   " + box2.width + "   " + box2.length + "   " + box2.weight);
    }
}
