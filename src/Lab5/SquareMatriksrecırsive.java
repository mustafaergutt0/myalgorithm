package Lab5;

public class SquareMatriksrecırsive {

    public static int[][] recursiveMultiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        // Taban durum: 1x1 matrisler
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
        } else {
            int newSize = n / 2;

            // Alt matrisleri oluştur
            int[][] A11 = new int[newSize][newSize];
            int[][] A12 = new int[newSize][newSize];
            int[][] A21 = new int[newSize][newSize];
            int[][] A22 = new int[newSize][newSize];

            int[][] B11 = new int[newSize][newSize];
            int[][] B12 = new int[newSize][newSize];
            int[][] B21 = new int[newSize][newSize];
            int[][] B22 = new int[newSize][newSize];

            // Matris A ve B'yi alt matrislere ayır
            for (int i = 0; i < newSize; i++) {
                for (int j = 0; j < newSize; j++) {
                    A11[i][j] = A[i][j];
                    A12[i][j] = A[i][j + newSize];
                    A21[i][j] = A[i + newSize][j];
                    A22[i][j] = A[i + newSize][j + newSize];

                    B11[i][j] = B[i][j];
                    B12[i][j] = B[i][j + newSize];
                    B21[i][j] = B[i + newSize][j];
                    B22[i][j] = B[i + newSize][j + newSize];
                }
            }

            // Rekürsif olarak alt matrisleri çarp
            int[][] C11 = addMatrices(recursiveMultiply(A11, B11), recursiveMultiply(A12, B21));
            int[][] C12 = addMatrices(recursiveMultiply(A11, B12), recursiveMultiply(A12, B22));
            int[][] C21 = addMatrices(recursiveMultiply(A21, B11), recursiveMultiply(A22, B21));
            int[][] C22 = addMatrices(recursiveMultiply(A21, B12), recursiveMultiply(A22, B22));

            // Sonuçları ana matrise birleştir
            for (int i = 0; i < newSize; i++) {
                for (int j = 0; j < newSize; j++) {
                    C[i][j] = C11[i][j];
                    C[i][j + newSize] = C12[i][j];
                    C[i + newSize][j] = C21[i][j];
                    C[i + newSize][j + newSize] = C22[i][j];
                }
            }
        }
        return C;
    }

    // İki matrisi toplayan yardımcı fonksiyon
    private static int[][] addMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 2x2 örnek matrisler
        int[][] data1 = {
                {1, 3},
                {7, 5}
        };

        int[][] data2 = {
                {6, 8},
                {4, 2}
        };

        int[][] result = recursiveMultiply(data1, data2);

        // Çarpım sonucunu satır satır yazdırma
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
