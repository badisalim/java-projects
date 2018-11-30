package ListMapeSetOptional;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {


        Set<String> backpack = new HashSet<>();

        String eggs = "Eggs";
        String bacon = "Bacon";
        String coffee = "Coffee";


        backpack.add(eggs);
        backpack.add(bacon);
        backpack.add(coffee);

        System.out.println("\n" + backpack);

        boolean containsEggs = backpack.contains(eggs);

        System.out.println("Is Eggs there? : " + containsEggs);

        for (String string : backpack) {

        }
        System.out.println(backpack);
        //Print out the list

            backpack.remove(coffee);
            System.out.println("\n" + backpack);

        boolean containsCoffee = backpack.contains(coffee);

        System.out.println("Is Coffee there? : " + containsCoffee);


        System.out.println(backpack);

        backpack.add(eggs);
        backpack.add(coffee);
       //s System.out.println("\n" + backpack);
        System.out.println(backpack);
        int size=backpack.size();

        System.out.println(size);
        }
    }
