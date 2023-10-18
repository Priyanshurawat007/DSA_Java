public class StringComparison {
    public static void main(String[] args) {
        String Fruits[]={"Apple","Mango","Banana"};

        String Largest=Fruits[0];
        for(int i=0;i<Fruits.length;i++){
            if (Largest.compareToIgnoreCase(Fruits[i]) < 0){
                Largest=Fruits[i];

        }

    }
    System.out.println("Largest String is:"+Largest);
    
}
 }

