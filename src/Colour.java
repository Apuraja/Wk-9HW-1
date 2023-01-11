//          Write a Java program to create a new array list, add some colours(string) and
//                  printout the collection using for each loop.
import java.util.*;
public class Colour {
    public static void main(String[] args) {
        //   Creating an array list and add some colors to the list
        ArrayList<String> Colours = new ArrayList<>();
        Colours.add("Green");
        Colours.add("Yellow");
        Colours.add("Black");
        Colours.add("Red");
        System.out.println("ArrayList: " + Colours);
        // Using forEach loop
        System.out.println("Iterating over ArrayList using for-each loop:");
        for (String Colour : Colours) {
            System.out.println(Colour);
            System.out.println(", ");
        }
    }
}


