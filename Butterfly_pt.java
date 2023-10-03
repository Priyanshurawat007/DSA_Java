package CodeWithHarry;

public class Butterfly_pt {
    public static void main(String[] args) {
        int n=4;
// For Upper Pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            int spaces;
            spaces=2*(n-i);
            for(int j=0;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
// For Lower pattern
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            int spaces;
            spaces=2*(n-i);
            for(int j=0;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
