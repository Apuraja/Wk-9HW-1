//      Write program and add all group members names in to array and iterates
//        through for each loop and print your name.

import java.util.ArrayList;
import java.util.List;

public class Ten {
    public static void main(String[] args) {
        List<String> myGroup= new ArrayList<String>();
        myGroup.add("Shivam");
        myGroup.add("Jigar");
        myGroup.add("Akshit");
        myGroup.add("Dhwanil");
        myGroup.add("Arpita");

       for(String e:myGroup){
            if(e.equalsIgnoreCase("Arpita")){
                System.out.println(e);
            }
        }
}}
