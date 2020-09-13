package com.company.Learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItems() throws IOException {
        String item = "";
        String fileDir = System.getProperty("user.dir");
        String fileText ="//groceryList.txt";
        String filePath = fileDir+fileText;
        //To contents from Text file and store them in an ArrayList
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        List<String> grocery =new ArrayList<String>();
        int i = 0;
        String line = "";
        while((line = br.readLine()) != null) {
            grocery.add(i,line);
            i++;
        }

        for (int j =0;j < grocery.size();j++){
             item = grocery.get(j);
             groceryList.add(item);
        }

        br.close();
        fr.close();
    }
    public void getTheAddedItems(){
        int i = 0;
        for(i=0;i<groceryList.size();i++){
            groceryList.get(i);
            System.out.println((i+1)+"." +groceryList.get(i));

        }
        System.out.println("Total number of items in the grocery list = " +groceryList.size());
    }

    public void modifyTheGroceryList(String item){
        System.out.println("Remove "+item+ " from my grocery list.");
        groceryList.remove(item);
        System.out.println("Your modified Grocery List is : ");
        getTheAddedItems();
    }

    public void checkIfAdded(String item){
        if(groceryList.contains(item)){
            System.out.println("Check if "+item+ " is added to my grocery list");
            System.out.println("Yes! " +item + " is already added to your grocery list.");
        }else {
            System.out.println("You have not yet added "+item +" items to your grocery list.");
        }

    }

    public void verifyNumberOfItems(){
        if(groceryList.size() < 5 || groceryList.size() > 15){
            System.out.println("You have added " +groceryList.size()+ " to your grocery list.");
            System.out.println("Your order cannot be processed.");
        }else {
            System.out.print("Processing your order!");
            System.out.print("Happy +!");
        }
    }

}
