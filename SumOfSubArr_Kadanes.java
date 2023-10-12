import java.util.*;
public class SumOfSubArr_Kadanes {
    public static void Kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum of SubArrays is:"+ms);
    }


    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Kadanes(numbers);

    }
    
}
