package com.oops.java;

public class Inventory {

    // instance variables

    String itemName;
    String ItemCode;
    boolean quantityInStock;
    int itemPrice;

    public Inventory(String itemName, String getItemCode, boolean quantityInStock, int itemPrice) {
        this.itemName = itemName;
        this.ItemCode = getItemCode;
        this.quantityInStock = quantityInStock;
        this.itemPrice = itemPrice;
    }

    public void DisplayOrderDetails() {
        System.out.println("item name:" + itemName);
        System.out.println("item code:" + ItemCode);
        System.out.println("item is in stock:" + quantityInStock);
        System.out.println("item price:" + itemPrice);
    }

    public static void main(String[] args) {

        Inventory order = new Inventory("noodiles", "132233221d", true, 120);
        Inventory order1 = new Inventory("Fried rice", "132233221d22", false, 100);

        order.DisplayOrderDetails();
        order1.DisplayOrderDetails();
    }
}