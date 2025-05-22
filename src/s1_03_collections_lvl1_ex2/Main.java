package s1_03_collections_lvl1_ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> reversedList = new ArrayList<Integer>();

        //myFirstList.add(2, 13, 213, 7, 1412, 20);
        Collections.addAll(myList, 2, 13, 213, 7, 1412, 20);

        System.out.println("ArrayList Elements in Normal Order");
        Iterator<Integer> myListIterator = myList.iterator();

        while(myListIterator.hasNext()) {
            System.out.println("" + myListIterator.next());
        }

        System.out.println("ArrayList Elements in Reversed Order");
        for(int i = myList.size(); i > 0; i--) {
            reversedList.add(myList.size() - i, myList.get(i - 1));
        }

        for(Integer invertedValue : reversedList) {
            System.out.println("" + invertedValue);
        }

    }
}
