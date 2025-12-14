package Lab5;

public class Matrisk {
    public static void main(String[] args) {
        int data1[][] = {{1, 7}, {3, 5}};
        int data2[][] = {{6, 4}, {8, 2}};

        int a[][] = data(data1, data2);

        // Çarpım sonucunu satır satır yazdırma
        for (int k = 0; k < a.length; k++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[k][j] + " ");
            }
            System.out.println(); // Her satırdan sonra yeni satıra geç
        }
    }

    public static int[][] data(int a[][], int b[][]) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        // Matris çarpımı için uygunluk kontrolü
        if (colsA != rowsB) {
            throw new IllegalArgumentException("A matrisinin sütun sayısı, B matrisinin satır sayısına eşit olmalıdır.");
        }

        int[][] newMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                newMatrix[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    newMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return newMatrix;
    }

}


