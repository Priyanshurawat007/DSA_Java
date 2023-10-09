

public class Clear_Bit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int NotbitMask=~(bitMask);   // BitMask=1<<pos


        int NewNum=NotbitMask & n;  //OPeration= not of BM & Original Num(N)

        System.out.println(NewNum);
    }
    
}
