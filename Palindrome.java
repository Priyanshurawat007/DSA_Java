import java.util.Scanner;
public class Palindrome {

   static void palindrom_Or_not(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    int Org_num=num;
    int rev=0;

    while(num!=0){
        rev=rev*10 +num%10;
        num=num/10;
}
    if(Org_num==rev){
        System.out.println("The given number is Palindrome");
    }else{
        System.out.println("The given number is not Palindrome");
    }
}
    public static void main(String[] args) {
        palindrom_Or_not();
    }
    
}
