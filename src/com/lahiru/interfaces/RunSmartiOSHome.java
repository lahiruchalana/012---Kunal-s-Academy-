package com.lahiru.interfaces;

public class RunSmartiOSHome {
    public static void main(String[] args) {
        SmartiOSHome smartHome = new SmartiOSHome();

        // check the normal kitchen pots status
        smartHome.potsWorking();
        smartHome.diningElectricItemsStatus();

        // upgrade normal kitchen to iOS smart kitchen
        smartHome.upgradeNormalKitchenToSmartiOSKitchen();

        // giving iOS smart kitchen status
        smartHome.potsWorking();
        smartHome.diningElectricItemsStatus();
    }
}
