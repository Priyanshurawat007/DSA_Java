import java.util.*;
public class Strings2 {

    public static void PrintString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        String str="DEVIL_IS_THE_KING";
        String Name="Priyanshu";
        String LastName="Rawat";
        String FullName=Name+LastName;

        System.out.println("FullName:"+Name);
        System.out.println();
        System.out.println("LastName:"+LastName);
        System.out.println();
        System.out.println("FullName:"+FullName);
        System.out.println();

        PrintString(str);
        
    }
    
}
