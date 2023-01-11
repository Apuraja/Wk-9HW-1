//           Create a HashMap object called people that will store String keys and Integer
//                 values: And use for each loop to iterate the value from Map.

import java.util.HashMap;

public class Seven {
    public static void main(String[] args) {

        HashMap<String, Integer> fruits = new HashMap<String, Integer> ();
        fruits.put( "Apple", 1);
        fruits.put( "Grape", 2);
        fruits.put("Pear",  3);
        fruits.put( "Orange", 4);
        for (Integer f : fruits.values()) {
            System.out.println(f);

    }}}





