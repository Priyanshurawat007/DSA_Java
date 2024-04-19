import java.util.*;

public class LargestElementInArray {
    public static int  largest(int[] arr) {
        Arrays.sort(arr);
        return arr.length-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n =sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
  
    System.out.println("The largest element in the given array is: "+arr[largest(arr)]);
    sc.close();
}
    
}
