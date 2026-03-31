package LeetCodeAndAlgorthm;

public class SpecialMatrixGivenBinaryMatrix {

    static void main() {

    }


    static public int numspeacil(int [][] mat){
        // was done ALgoVİRTOUS 31/03/2026
        // it is easy solution find row and columun  for 1 every than check  its row and colum  if increase counter
        // two loop Adet should be two

        int m = mat.length;
        int n = mat[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int Adet=0;
                if(mat[i][j]==1){
                    for(int k=0;k<n;k++){

                        if(mat[i][k]==1){
                            Adet++;
                        }
                    }
                    for(int l=0;l<m;l++){
                        if(mat[l][j]==1){
                           Adet++;
                        }

                    }
                    if(Adet==2){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
