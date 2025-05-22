package s1_01_collections_lvl1_ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();

        //Create & Add month to ArrayList
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        //ArrayList - adding august in i[7]
        Month august = new Month("August");
        months.add(7, august);

        System.out.println(months.get(7).getName());
        System.out.println(months.toString());

        HashSet<Month> hashMonths = new HashSet<>(months);

        //How to assure no duplicates in the hashSet
        if(hashMonths.contains(august)) {
            System.out.println("This month already exists in the list");
        } else {
            hashMonths.add(august);
        }

        //For loop
        for (Month monthName : hashMonths) {
            System.out.println(monthName);
        }

        //Iterator


    }
}
