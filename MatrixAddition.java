// Add two matrices of the same size, element by element.
// e.g. [[1, 2], [3, 4]] + [[5, 6], [7, 8]] = [[6, 8], [10, 12]]

public class MatrixAddition {

    public static int[][] add(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same size");
        }
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        System.out.println("Matrix A + Matrix B =");
        printMatrix(add(a, b));

        int[][] c = {{1, 2, 3}, {4, 5, 6}};
        int[][] d = {{6, 5, 4}, {3, 2, 1}};
        System.out.println("Matrix C + Matrix D =");
        printMatrix(add(c, d));
    }
}
