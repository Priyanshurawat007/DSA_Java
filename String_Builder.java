package CodeWithHarry;

public class String_Builder {
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder("G");
        sb.append('o');
         sb.append('l');
          sb.append('u');

        
        //setcharAt is used to replace the existing value with new one
        // sb.setCharAt(0, 'R');
        //  sb.setCharAt(4, ' ');

        //  //inser() is used to insert a value at a particular index
        //  sb.insert(4, 'R');
        System.out.println(sb);

    }
    
}
