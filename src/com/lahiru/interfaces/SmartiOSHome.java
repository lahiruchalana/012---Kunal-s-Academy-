package com.lahiru.interfaces;

// single inheritance, class to interface (not multiple inheritance)
public class SmartiOSHome {

    private Dining iOSDining = new SmartiOSDining();
    private Kitchen kitchen;

    public SmartiOSHome() {
        kitchen = new NormalKitchen();
    }

    public SmartiOSHome(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void windowOpen() {
        kitchen.windowOpen();
    }

    public void potsWorking() {
        kitchen.potsIsAtOnOff();
    }

    public void upgradeNormalKitchenToSmartiOSKitchen() {
        kitchen = new SmartiOSKitchen();
    }

    public void diningElectricItemsStatus() {
        iOSDining.electricItemsIsAtOnOff();
    }

    public void diningWindowStatus() {
        iOSDining.windowOpen();
    }
}
