import java.util.Scanner;
public class CalcSimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        double P = sc.nextDouble();
        System.out.println("Enter the time for which interest is to be calculated in years");
        double T=sc.nextDouble();
        System.out.println("Enter the rate of simple intrest per year : ");
        double R=sc.nextDouble();

        double total=(P*T*R)/100f;
        
        System.out.println("Total Intrest Earned to your Principle amount:"+total);
    }
    
}
