package com.lahiru.other_package;

import com.lahiru.access_controller.Machinery;

public class HousingMachineries extends Machinery {

    public HousingMachineries(String name, int id, int price) {
        super(name, id, price);
    }

    public static void main(String[] args) {
        HousingMachineries hsmachinery = new HousingMachineries("grinder", 234, 672341);

        hsmachinery.price = 5556;
        System.out.println(hsmachinery.price);


        Machinery tv = new Machinery("tv", 256, 6766);

//        tv.price = 3424; // in this case protected price can not access because the Machinery super class do not know that
        // this HousingMachinery is a subclass of it.

    }
}
