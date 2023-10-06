package CodeWithHarry;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your FullName:");
        String name=sc.nextLine();

        System.out.println(name);
        System.out.println(name.length());
        String sentence="My Name is Devil";

        String name2=sentence.substring(10, sentence.length());
        System.out.println(name2);


        //To Compare
        //If(s1.compareTo(s2)==0)

      

    }
    
}
