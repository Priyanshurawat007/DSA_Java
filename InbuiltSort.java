import java.util.Arrays;
import java.util.Scanner;

public class InbuiltSort {
    

    public static void PrintArr(int arr[]){
        for (int i = 0 ;i < arr.length;i++) {
             System.out.print( arr[i]+" ");
        }
        System.out.println("is Sorted Array");
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array elements");
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();       
         }
        Arrays.sort(arr);
        PrintArr(arr);


    }
    
}
