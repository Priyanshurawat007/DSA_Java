public class Bit_Odd_or_even {
    public static void BitManipulation(int n){
        int bitmask=1;
        if((n & bitmask )==0){
            System.out.println("Even Number");

        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        BitManipulation(5);
        BitManipulation(10);
        BitManipulation(101);
        
    }
    
}
