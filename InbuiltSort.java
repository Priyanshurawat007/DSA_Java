import java.util.Arrays;

public class InbuiltSort {

    public static void PrintArr(int arr[]){
        for (int i = 0 ;i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,30,40,20,50,60};

        Arrays.sort(arr);
        PrintArr(arr);


    }
    
}
