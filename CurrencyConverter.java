import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money in Ruppes:");
        double rup = sc.nextDouble();
        System.out.println("Enter type of currency you want to convert ruppes to- 1.Dollar 2.Pond 3.Riyal 4.Euro:");
        int currencyType=sc.nextInt();
        float Dollar=(float)rup/82.91f;
        float Pond=(float)rup/105.81f;
        float Riyal=(float)rup/22.11f;
        float euro=(float)rup/90.95f;

        switch (currencyType) {
            case 1:if(currencyType==1){
                System.out.printf("\n1.Ruppes to Dollar");
                System.out.println("In Dollar the value will be:"+Dollar);
            }
            case 2:if(currencyType==2){
                System.out.println("\n2.Rupees to Pound");
                System.out.println("In Pond the value will be: "+Pond);
            }
            case 3:if(currencyType==3){
                System.out.println("\n3.Rupees to Saudi Arabian Riyal");
                System.out.println("In Riyal the value wil be:"+Riyal);
            }
            case 4:if(currencyType==4){
                System.out.println("\n4.Rupees to Euro");
                System.out.println("In Euro the value will be:"+euro);
            }
                
                break;
        
            default:if (currencyType>4) {
                System.out.println("Invalid input! Please enter a number between 1 and 4");
                
            }
                break;
        }

    }
}
