import java.util.Scanner;
//                                    Marksheet
public class Two {
    public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter student name :");
            String name = in.next();
//            System.out.print("Enter student class: ");
//            String sclass = in.next();
            System.out.print("Enter student roll no.: ");
            String sroll = in.next();
            System.out.print(" Math: ");
            int math= in.nextInt();
            System.out.print(" Science: ");
            int sci = in.nextInt();
            System.out.print(" English: ");
            int eng = in.nextInt();

            int total = math + sci + eng ;
            double p = total / 300.0 * 100.0;
            String g = "";
            if (p >= 90)
                g = "A+";
            else if (p >= 80)
                g = "A";
            else if (p >=70)
                g = "B+";
            else if (p >= 60)
                g = "B";
            else if (p >= 50)
                g = "C";
            else if (p >= 40)
                g = "D";
            else if (p >= 35)
                g = "E";
            String result = "Pass";
            if (p<35)
                result = "Fail";
            System.out.println("|_________________________|");
            System.out.println("|       Mark Sheet        |");
            System.out.println("|_________________________|");
            System.out.println("|   Name       : "+name+" |");
            System.out.println("|   Roll No    : "+sroll+"|");
            System.out.println("|-------------------------|");
            System.out.println("|   Math       : "+math+" |");
            System.out.println("|   Science    : "+sci+"  |");
            System.out.println("|   English    : "+eng+"  |");
            System.out.println("|-------------------------|");
            System.out.println("|   Total      : "+total+"|");
            System.out.println("|_________________________|");
            System.out.println("|   Percentage : "+p+"    |");
            System.out.println("|   Result     : "+result+"|");
            System.out.println("|   Grade      : "+g+"    |");
            System.out.println("|-------------------------|");
        }
    }

