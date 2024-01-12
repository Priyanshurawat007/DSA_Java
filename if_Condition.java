import java.util.Scanner;
public class if_Condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x=sc.nextInt();
        System.out.print("Enter the Second Number:");
        int y = sc.nextInt();
        System.out.print("Enter the number for the Operations: 1->+,2-> -,3-> *,4-> / ");
        int z=sc.nextInt();
        int Addition=x+y;
        int Subtraction=x-y;
        int Multiplication=x*y;
        double Division= (double)x/y;
        switch (z) {
            case 1:if(z==1){
                System.out.print("The Addition of the number is:"+Addition);
            }
                
                break;
           case 2:if(z==2){
            System.out.print("The Subtraction of the number is:"+Subtraction);
        }
        case 3:if(z==3){
            System.out.print("The Multiplication of the number is:"+Multiplication);
        }
        case 4:if(z==4){
            System.out.print("The Division of the number is:"+Division);
        }
        
            default:if(z>4){
                System.out.println("Invalid Choice");
            }
                break;
        }
        
    }
    
}
