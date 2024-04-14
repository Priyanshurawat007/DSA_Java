public class FrequencyCount {
    public static int  count(int n,int arr[]) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n){
                count=count+1;
            }
        }


        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,5,4};
        int n=2;
        System.out.println("Frequency of element "+n+" is "+count(n,arr));
    }
}
