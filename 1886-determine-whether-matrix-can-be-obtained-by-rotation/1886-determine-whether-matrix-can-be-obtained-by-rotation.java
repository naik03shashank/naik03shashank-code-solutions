import java.util.Arrays;

class Solution {

    private void reverse(int[] row, int n) {
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;

            i++;
            j--;
        }
    }

    private void rotate(int[][] mat) {
        int n = mat.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            reverse(mat[i], n);
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {

            if (Arrays.deepEquals(mat, target)) {
                return true;
            }

            rotate(mat);
        }

        return false;
    }
}