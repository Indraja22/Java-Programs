package com.company.Learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        GroceryList groceryList = new GroceryList();
        groceryList.addItems();
//        groceryList.addItems("Eggs");
//        groceryList.addItems("Milk");
//        groceryList.addItems("Bread");
//        groceryList.addItems("Butter");
//        groceryList.addItems("Brown Bread");
//        groceryList.addItems("Cadbury Silk");
//        groceryList.addItems("Chicken");
//        groceryList.addItems("Sausage");
//        groceryList.addItems("Prawns");
//        groceryList.addItems("Butter Milk");
//        groceryList.addItems("Multigrain Bread");
//        groceryList.addItems("Pork");
//        groceryList.addItems("Orange Juice");
//        groceryList.addItems("Almond Milk");
//        groceryList.addItems("Cheese");
//        groceryList.addItems("Cream");
//        groceryList.addItems("Oats Rolled");
//        groceryList.addItems("Coffee powder");
//        System.out.println("You have added the following to your grocery list : ");
        groceryList.getTheAddedItems();
        groceryList.modifyTheGroceryList("Bread");
        groceryList.modifyTheGroceryList("Cheese");
        groceryList.modifyTheGroceryList("Pork");
        groceryList.modifyTheGroceryList("Prawns");
        groceryList.checkIfAdded("Bread");
        groceryList.verifyNumberOfItems();

    }
}
