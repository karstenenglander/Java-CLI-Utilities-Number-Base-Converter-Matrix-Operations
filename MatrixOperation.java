import java.util.Scanner;
import java.util.Random;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("(1) Add two matrices");
            System.out.println("(2) Multiply two matrices");
            System.out.println("(3) Quit");
            int operation = scanner.nextInt();

            if (operation == 3) {
                break;
            }

            System.out.println("Enter the number of rows and columns for the first matrix:");
            int rows1 = scanner.nextInt();
            int cols1 = scanner.nextInt();

            System.out.println("Enter the number of rows and columns for the second matrix:");
            int rows2 = scanner.nextInt();
            int cols2 = scanner.nextInt();

            if (operation == 1 && (rows1 != rows2 || cols1 != cols2)) {
                System.out.println("Error: The two matrices must have the same dimensions for addition.");
                continue;
            }

            if (operation == 2 && cols1 != rows2) {
                System.out.println("Error: The number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.");
                continue;
            }

            int[][] matrix1 = generateMatrix(rows1, cols1, random);
            int[][] matrix2 = generateMatrix(rows2, cols2, random);

            System.out.println("Matrix A:");
            printMatrix(matrix1);

            System.out.println("Matrix B:");
            printMatrix(matrix2);

            if (operation == 1) {
                System.out.println("Result of addition:");
                printMatrix(addMatrices(matrix1, matrix2));
            } else {
                System.out.println("Result of multiplication:");
                printMatrix(multiplyMatrices(matrix1, matrix2));
            }
        }

        scanner.close();
    }

    private static int[][] generateMatrix(int rows, int cols, Random random) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}