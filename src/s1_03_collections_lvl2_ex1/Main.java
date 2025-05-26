package s1_03_collections_lvl2_ex1;

import java.util.HashSet;

public class Main {
    public static void main(String [] args) {
        //Create restaurant
        //Create hashset
        //Compare new obj with set objs (if exists, not add - catch error-, if not, add in the set)
        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

        restaurants.add(new Restaurant("Manolo's", 3));
        restaurants.add(new Restaurant("Pizzeria Luigi", 9));
        restaurants.add(new Restaurant("Don Patch Bakery", 7));

        System.out.println(restaurants.toString());
    }
}
