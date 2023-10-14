import java.util.*;
import java.util.Arrays;

public class InsertionSort {
    public static void Insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void PrintArr(int arr[]){
        for (int i = 0 ;i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,30,50,20,40,60};
        Insertion(arr);
        // Arrays.sort(arr);  // Inbuilt Java Package for Sorting an Array
        PrintArr(arr);

    }
    
}
