import java.util.*;
public class TrappedWater {
    public static int trappedRainWater(int numbers[]){
        int n=numbers.length;
        int leftMax[]=new int[n];
        leftMax[0]=numbers[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(numbers[i],leftMax[i-1]);

        }
        int rightMax[]=new int[n];
        rightMax[n-1]=numbers[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(numbers[i],rightMax[i+1]);

        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-numbers[i];
        }
        return trappedWater;

        


    }
    public static void main(String[] args) {
        int numbers[]={2,1,4,2,4,0,4};
        System.out.println("The Trapped Water will be:"+trappedRainWater(numbers)+" liters");
    }
    
}
