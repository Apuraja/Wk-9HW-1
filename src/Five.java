import java.util.ArrayList;

//  Write a Java program to test an array list is empty or not. Define array list with
//                   underground tube names
public class Five {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        if(myList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}

