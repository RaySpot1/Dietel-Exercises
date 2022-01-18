package chapterSeven;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new java.util.ArrayList<>();
        shoppingList.add("Maggi 1400");
        shoppingList.add("Omo 1200");
        shoppingList.add("Rice 2000");
        shoppingList.add("Beans 3000");
        int size = shoppingList.size();
        //System.out.println(size);//printing the size of the list
        // System.out.println(shoppingList.get(0));// using get method to get each items in the shopping list

        for (String list : shoppingList) {
            System.out.println(list);
        } // looping through all the lists and printing them out using advanced for loops

    }
}
