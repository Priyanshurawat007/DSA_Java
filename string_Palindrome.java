import java.util.Scanner;

public class string_Palindrome {

    static void palindromeOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
        String org_str = str;
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (org_str.equals(rev)) // for reverse the string
        {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        palindromeOrNot();
    }
}
