package CodeWithHarry;

public class Diamond_PT {
    public static void main(String[] args) {
        int n=5;
// for Upper Half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int star=2*i-1;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int star=2*i-1;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
