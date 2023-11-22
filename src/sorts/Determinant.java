package sorts;

public class Determinant {
    public static int findDeterminant(int[][] matrix) {
        int determinant = 0;

        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        if (matrix.length == 1) {
            return matrix[0][0];
        }

        for (int i = 0; i < matrix.length; i++) {
            determinant += (int)(matrix[i][0] * Math.pow(-1, 2 + i)
                    * findDeterminant(arrWithoutRowCol(matrix, i, 0)));
            // System.out.println(determinant);
        }
        return determinant;
    }


    public static int[][] arrWithoutRowCol(int[][] matrix, int row, int col) {
        int[][] newArray = new int[matrix.length - 1][matrix.length - 1];
        int k = 0, l = 0; // индексы нового массива для итераций

        for (int i = 0; i < matrix.length; i++) {
            if (i != row) {
                for (int j = 0; j < matrix.length; j++) {
                    if (j != col) {
                        newArray[k][l] = matrix[i][j];
                        l++;
                    }
                }
                k++;
            }
            l = 0;
            //System.out.println(Arrays.deepToString(newArray));
        }

        return newArray;
    }
}
