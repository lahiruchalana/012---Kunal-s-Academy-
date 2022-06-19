package com.lahiru.polymorphism;

public class Main {
    public static void main(String[] args) {
        FinanceMinistry financeMinistry = new FinanceMinistry();
        AdminInFinanceMinistry adminInFinanceMinistry = new AdminInFinanceMinistry();
        ManagementInFInanceMinistry managementInFInanceMinistry = new ManagementInFInanceMinistry();

        financeMinistry.mainTask();
        adminInFinanceMinistry.mainTask();
        managementInFInanceMinistry.mainTask();
    }
}
