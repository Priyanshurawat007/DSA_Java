

import java.util.Scanner;

public class Bit_Update {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opr=sc.nextInt();
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        if(opr==1){

        int newNum=bitmask | n;

        System.out.println(newNum);
        }
        else{
            int NotbitMask=~(bitmask);   // BitMask=1<<pos


            int NewNum=NotbitMask & n;  //OPeration= not of BM & Original Num(N)
    
            System.out.println(NewNum);
        }

    }
    
}
