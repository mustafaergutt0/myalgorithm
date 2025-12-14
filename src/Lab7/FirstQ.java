package Lab7;


import Lab7.matrix;

public class FirstQ {
    public static void main(String[] args) {
        int[] sizes = {2, 4, 8, 16, 32, 64, 128};

        for (int size : sizes) {
            int[][] A = new int[size][size];
            int[][] B = new int[size][size];
            int[][] C = new int[size][size];

            matrix.initialize_2d_array_random(A);
            matrix.initialize_2d_array_random(B);
            matrix.initialize_2d_array(C);

            // SQMM
            long start = System.nanoTime();
            matrix.square_matrix_multiply(A, B, C);
            long elapsed = System.nanoTime() - start;
            System.out.printf("Size: %d, SQMM time: %d ns\n", size, elapsed);

            // SQMMR
            matrix.initialize_2d_array(C);
            start = System.nanoTime();
            matrix.square_matrix_multiply_recursive(A, B, 0, size - 1, 0, size - 1, 0, size - 1, 0, size - 1, 0, size - 1, 0, size - 1, C);
            elapsed = System.nanoTime() - start;
            System.out.printf("Size: %d, SQMMR time: %d ns\n", size, elapsed);

            // STMM
            matrix.initialize_2d_array(C);
            start = System.nanoTime();
            matrix.strassen_matrix_multiply(A, B, C);
            elapsed = System.nanoTime() - start;
            System.out.printf("Size: %d, STMM time: %d ns\n", size, elapsed);
        }
    }
}
