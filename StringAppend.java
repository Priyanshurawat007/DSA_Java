public class StringAppend {
    public static void ToUpperCase(){
        String str="Hi,This is Priyanshu Rawat";

        String Upper=str.toUpperCase();
        System.out.println(Upper);
    }
    public static void main(String[] args) {
        StringBuilder Sb=new StringBuilder("null");
        for(char ch='a';ch<='z';ch++){
            Sb.append(ch);

            System.out.print(ch+" ");
          

        }
        System.out.println();
          ToUpperCase();

    }
    
}
