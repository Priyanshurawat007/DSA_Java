public class BitManipulation_Methods {
    public static int BitManipulationGetIthbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int BitManipulationSetIthbit(int n,int i){
        int bitmask=1<<i;  //'<<' ->LeftShift , '>>' -> RightShift
        
            return n|bitmask;
        
    }
     public static int BitManipulationClearIthbit(int n,int i){
        int bitmask=~(1<<i);
        
            return n & bitmask;
        
    }
    public static boolean Power_of_2(int n){
        return (n&(n-1))==0;
    }
    public static int CountSetBit(int n){
        // Set bits -> 1;
        int count=0;
        while(n > 0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int FastExponantial(int a,int n){ // a -> number ,  n -> Exponential of the number;
        int ans=1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
             

            }
               a = a * a;
                n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
    //    System.out.println(BitManipulationSetIthbit(10, 2)); 
    //     System.out.println(BitManipulationGetIthbit(10, 4));
    //     System.out.println(BitManipulationClearIthbit(10, 1));
    //     System.out.println(Power_of_2(64));
    //     System.out.println(CountSetBit(10));
        System.out.println(FastExponantial(3, 5));
        
    }
    
}
