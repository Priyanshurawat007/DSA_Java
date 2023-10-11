import java.util.Scanner;
public class RemoveVowels {

    public static void Remove_Vowels(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String Sentence=sc.nextLine();

        String sl="";

        sl=Sentence.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowels:"+sl);


    }
    public static void main(String[] args) {
        Remove_Vowels();
        
    }
    
}
