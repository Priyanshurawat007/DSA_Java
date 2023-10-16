public class SpiralMatrix {

    public static void PrintSpiral(int Matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=Matrix.length-1;
        int endCol=Matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(Matrix[startRow][j]+" ");

            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(Matrix[i][endCol]+" ");

            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(Matrix[endRow][j]+" ");

            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(Matrix[i][startCol]+" ");

            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;


        }
        System.out.println();
    }
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3,4},
        {5,6,7,8},
    {9,10,11,12},
{13,14,15,16}};

PrintSpiral(Matrix);


    }
    
}
