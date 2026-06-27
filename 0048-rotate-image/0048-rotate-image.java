class Solution {

    public void reverse(int[] arr, int n){
        int i = 0; 
        int j = n-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        
        int n = matrix.length;

        // Transpose the matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the each row
        for(int i=0; i<n; i++){
            reverse(matrix[i], n);
        }
    }
} 

