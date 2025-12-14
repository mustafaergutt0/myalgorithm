package Lab7;

///

/*
in this algorithm we are given the number whihc is not power of two

 our alogrithm it will complete with zero until find x number whihc is power of two


*/


public class StrassenSoluiton {
    public static void main(String[] args) {
        // 2-b kısmındaki matrisler
        int[][] A = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        int[][] B = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        // Matrisleri kare matrislere dönüştürme
        int[][] paddedA = padMatrix(A);
        int[][] paddedB = padMatrix(B);
        int[][] paddedC = new int[paddedA.length][paddedB[0].length];

        // Strassen algoritması ile çarpım
        matrix.strassen_matrix_multiply(paddedA, paddedB, paddedC);

        // Sonucu orijinal boyutlara indirme
        int[][] C = trimMatrix(paddedC, A.length, B[0].length);

        // Sonuçları yazdırma
        System.out.println("Sonuç Matrisi:");
        matrix.print_2d_array(C);
    }

    // Matrisleri kare hale getiren metot
    public static int[][] padMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int newSize = 1;

        // Satır ve sütunların maksimumunu alıp bir üst 2'nin kuvvetine tamamla
        while (newSize < Math.max(rows, cols)) {
            newSize *= 2;
        }

        // Yeni boyutlu sıfırlarla dolu matris oluştur
        int[][] padded = new int[newSize][newSize];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                padded[i][j] = matrix[i][j];
            }
        }

        return padded;
    }

    // Sonucu orijinal boyutlara indiren metot
    public static int[][] trimMatrix(int[][] paddedMatrix, int originalRows, int originalCols) {
        int[][] trimmed = new int[originalRows][originalCols];
        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                trimmed[i][j] = paddedMatrix[i][j];
            }
        }
        return trimmed;
    }
}
