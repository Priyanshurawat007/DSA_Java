package CodeWithHarry;
import java.util.Scanner;

public class LinearSearchIn2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of Columns: ");
       
        int cols=sc.nextInt();

        int a[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to be Searched:");
        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]==x){
                System.out.println("Found at index: ("+i + "," + j + ")");
            }
        }
        }
         System.out.println();
       
        
    }
    
}
