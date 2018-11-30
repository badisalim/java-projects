package ListMapeSetOptional;

import java.util.ArrayList;
import java.util.Scanner;
import java.util .*;
public class BasicShoppingApplication {

    public static void main(String[] args) {
        List<String> grocery = new ArrayList<>();

        String string="Eggs";
        String string1="Bacon";
        String string2="Coffee";
        String string3="Milk";

        //Add some items
        grocery.add("Eggs");
        grocery.add("Bacon");
        grocery.add("Coffee");
        grocery.add("Milk");
        System.out.println("\n" + grocery);
        grocery.remove("Eggs");

        //Print out the list
        System.out.println("\n" + grocery);

        grocery.add("Coffee");
        System.out.println("\n" + grocery);
        grocery.remove(3);
        System.out.println("\n" + grocery);
        //Print number of items in list
       // System.out.println("Number of items: " +grocery.numberOfItems());



    }
}