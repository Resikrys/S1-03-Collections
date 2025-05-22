package s1_01_collections_lvl1_ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();

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

        Month august = new Month("August");
        months.add(7, august);

        System.out.println(months.get(7).getName());
        System.out.println(months.toString());

    }
}
