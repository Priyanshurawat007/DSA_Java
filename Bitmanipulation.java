

public class Bitmanipulation {
    public static void main(String[] args) {
        int n=5;  //0101 ->In Binary
        int pos=3;
        int bitMask=1<<pos;

        if((bitMask & n) == 0){
            System.out.println("bit was Zero");
        }else{
            System.out.println("bit was one");

        }
    
    
}
}
