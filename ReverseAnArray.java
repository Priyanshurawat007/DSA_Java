public class ReverseAnArray {

    public static void reverse(int n,int arr[]){
        swap(n, arr);
       
       
            System.out.print("Reversed array is:- \n");
            for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
            
         }
    }
    public static void swap(int n,int arr[]){
        int p1=0;int p2=n-1; int tmp=0;
        while (p1<p2){
        tmp = arr[p1];
        arr[p1] = arr[p2];  
        arr[p2] = tmp;
        p1++;
        p2--;
    }
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        reverse(n, arr);
        

    }
}

