package CodeWithHarry;

public class New_PT {
    public static void main(String[] args) {
        System.out.println("Right Triangle Pattern");
        // System.out.println("\n");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                       System.out.print("*");
                       }
                       System.out.println();

        }
         System.out.println("Inverted Right Triangle Pattern");
        //  System.out.println("\n");
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                       System.out.print("*");
                       }
                       System.out.println();
        }

        System.out.println();

        System.out.println("Rectangle Pattern");

        for(int j=1;j<=n;j++){
            
                System.out.print("*****");
            
            System.out.println();
        }
        System.out.println("Left Triangle Pattern");

        for(int j=1;j<=n;j++){
            for(int k=1;k<=n-j;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
        System.out.println();
        
    }
    System.out.println("Inverted Left Triangle Pattern");

     for(int j=n;j>=1;j--){
            for(int k=1;k<=n-j;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
        System.out.println();
        
    }
}   
}
