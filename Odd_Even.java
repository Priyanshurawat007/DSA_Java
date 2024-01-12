import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the desired number: ");
    int n=sc.nextInt();
       
        
        if (n % 2 == 0){
            System.out.println("The Number is Even ");
    }else if (n % 3==0) {
        System.out.println("The Number is Odd");
        
    }else{
        System.out.println("Number is neither even nor odd it is Prime Number");
    }
}
        
    }

      

   
