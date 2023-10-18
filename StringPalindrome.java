import java.util.Scanner;
public class StringPalindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String:");
        String str=sc.next();
        System.out.println(isPalindrome(str));
        if(isPalindrome(str)==true){
            System.out.println("The given String is palindrome!!");
        }
    }
    
}
