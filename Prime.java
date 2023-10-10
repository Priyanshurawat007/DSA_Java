import java.util.Scanner;
public class Prime {
    static void Prime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int prime= num%1;
        int prime2=num%num;
        int prime3=num%2;
        if(prime==0 && prime2==0 && prime3!=0){
            System.out.println("The Given number is Prime");

        }else{
            System.out.println("The Given number is not Prime");
        }

    
       
    }


    public static void main(String[] args) {
        Prime();
    }
    
}
