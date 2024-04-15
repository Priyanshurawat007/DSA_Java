import java.util.*;
public class NewPrimeMethod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number of prime numbers you want to generate:");
        int n=sc.nextInt();
       

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Number is Prime");
        }else{
            System.out.println("number is not prime");
        }
}
}