class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int trp[][] = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++){

            for(int col = 0; col < matrix[0].length; col++){

                trp[col][row] = matrix[row][col];
            }
        }

        return trp;
    }
}