package matrixTranspose;

public class MatrixTranspose {
    public static void main(String[] args){

        int matrix [][]={{2,5,8},{3,7,1}};
        int transpoze [][]=new int[3][2];

        System.out.println("Matris");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i=0;i< matrix.length;i++){
            for(int j=0 ; j<matrix[i].length; j++){

                transpoze[j][i]=matrix[i][j];

            }
        }
        System.out.println("Matrisin Transpozu");
        for(int i=0;i< transpoze.length;i++){
            for(int j=0;j<transpoze[i].length;j++){
                System.out.print(transpoze[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
