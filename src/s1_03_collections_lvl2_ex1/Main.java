package s1_03_collections_lvl2_ex1;

import java.util.*;

public class Main {
    public static void main(String [] args) {
        HashSet<Restaurant> restaurants = new HashSet<Restaurant>(); //unordered

        restaurants.add(new Restaurant("Manolo's", 3));
        restaurants.add(new Restaurant("Luigi's Mansion", 9));
        restaurants.add(new Restaurant("Don Patch Bakery", 7));

        Restaurant newRestaurant = new Restaurant("Manolo's", 5);

        try {
            boolean sameName = false;
            boolean sameScore = false;

            for (Restaurant r : restaurants) {
                if (r.getName().equalsIgnoreCase(newRestaurant.getName()) &&
                        r.getScore() == newRestaurant.getScore()) {
                    throw new Exception("This restaurant already exists in the list.");
                }

                if (r.getName().equalsIgnoreCase(newRestaurant.getName())) {
                    sameName = true;
                }

                if (r.getScore() == newRestaurant.getScore()) {
                    sameScore = true;
                }
            }

            // Advert
            if (sameName) {
                System.out.println("⚠️ A restaurant with this name already exists in the list but successfully added.");
            }
            if (sameScore) {
                System.out.println("⚠️ A restaurant with this score already exists in the list but successfully added.");
            }

            // Add restaurant
            restaurants.add(newRestaurant);

        } catch (Exception e) {
            System.out.println("❌ " + e.getMessage());
        }

        System.out.println("\n📋 Restaurant list:");
        for (Restaurant r : restaurants) {
            System.out.println(" - " + r);
        }

        //EXERCISE 2: add descendant list sort
        List<Restaurant> restaurantList = new ArrayList<>(restaurants); //ordered list

        restaurantList.sort(
                Comparator.comparing(Restaurant::getName, Comparator.reverseOrder()) //Order from Z to A
                        .thenComparing(Comparator.comparing(Restaurant::getScore).reversed()) //Order from 10 to 0
        );

        System.out.println("\n📋 Sorted restaurant list:");
        for (Restaurant r : restaurantList) {
            System.out.println(r);
        }

    }
}
