import java.util.ArrayList;
import java.util.List;

//      Write program and add all group names in to array and iterates through for each loop
public class Nine {
    public static void main(String[] args) {
        List<String> myGroup= new ArrayList<String>();
        myGroup.add("Shivam");
        myGroup.add("Jigar");
        myGroup.add("Akshit");
        myGroup.add("Dhwanil");
        myGroup.add("Arpita");

        for (String allNames : myGroup) {
            System.out.println(allNames);
        }


    }}
