package LeetCodeAndAlgorthm;

public class SetMatrixZero {
    static void main() {

    }



    static void setZeroes(int[][] matrix) {
        int  rows = matrix.length;
        int cols = matrix[0].length;
        int setzero=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    for(int a=0;a<cols;a++){
                        if(matrix[i][a]==0){ // çok önemli o rowdkai sıfrı tekrkar görmek için
                            continue;
                        }
                        matrix[i][a]=setzero;
                    }for(int b=0;b<rows;b++){
                        if(matrix[b][i]==0){  // çok önemli o columdaki sıfrı tekrkar görmek için
                            continue;
                        }
                        matrix[b][j]=setzero;
                    }

                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==setzero){
                    matrix[i][j]=0;
                }
            }
        }


    }


    static void SetZeros (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstRowZero=true;
            }
        }
        for(int i=0;i<cols;i++){
            if(matrix[0][i]==0){
                firstColZero=true;
            }

        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){  // burdaki bulduğun yerin colum ve rowdaki yerini işareterlid
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        if(firstRowZero){
            for(int i=0;i<rows;i++){
                if(matrix[i][0]==0){
                    matrix[i][0]=0;
                }
            }
        }
    }
}
