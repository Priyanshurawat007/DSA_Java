import  java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x =sc.nextInt();
        System.out.print("Enter the second number:");
        int y=sc.nextInt();
        if (x>y){
            System.out.println("X is greater than Y");
        }
        else if (x==y) {
            System.out.println("Both numbers are equal");
            
        } else {
            System.out.println("Y is greater than X");
        }
        
        
    }
    
}
