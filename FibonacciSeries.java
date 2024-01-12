import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3;
        System.out.println("Enter the number of terms in the series:");
        int n=sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        

    }
    
}
