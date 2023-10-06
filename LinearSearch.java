package CodeWithHarry;
import java.util.Scanner;;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the array elements");
        
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();       
         }
         System.out.println("Enter the Desired Element");
            int x=sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                System.out.println("found at index "+i);
            }
            
        }
        
    

    }

    
}

