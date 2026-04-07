package LeetCodeAndAlgorthm;

public class RotateImage {
    static void main() {

    }


    static public void rotate(int[][] matrix) {
        // you need to transpose matriks what is  tranpose i,j  change them j ,i

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;  // bu direk trasnpsoe yapar
            }
        }

        // need to take reverse   //  reverse yaptı
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int tamp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=tamp;




            }

        }
    }
}
