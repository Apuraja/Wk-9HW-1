// Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Four {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<String>();
        aList.add("Mango");
        aList.add("Banana");
        aList.add("Orange");
        aList.add("Apple");
        aList.add("Pineapple");
        Iterator i = aList.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}