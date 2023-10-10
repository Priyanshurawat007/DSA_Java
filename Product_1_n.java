import java.util.Scanner;
public class Product_1_n {
    static void Sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int  num=sc.nextInt();
    int sum1=1;
        for(int i=1;i<=num;i++){
              sum1=sum1*i;
           
        }
         System.out.println("The Sum Of the given number is:"+sum1);
    }
    public static void main(String[] args) {
        Sum();
        
    }
    
}
