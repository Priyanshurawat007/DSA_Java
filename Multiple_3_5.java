import java.util.Scanner;
public class Multiple_3_5 {


    static void Multipe_Of(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int num=sc.nextInt();
             if (num% 3 ==0 && num%5==0){
             
             System.out.println("The Given number is divisible of 3 & 5");
             }else{
                System.out.println("The Given number is not divisible of 3 & 5");
             }
      
    }



    public static void main(String[] args) {
       Multipe_Of();
        
       
    }
    
}
