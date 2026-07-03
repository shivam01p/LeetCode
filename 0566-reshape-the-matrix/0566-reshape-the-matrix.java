class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if( r*c != (mat.length*mat[0].length)){
            return mat;
        }

        int temp[] = new int[r*c];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){

                temp[(mat[0].length*i) + j] = mat[i][j];
            }
        }

        int ans[][] = new int[r][c];
        for(int tp = 0; tp<temp.length; tp++){
            ans[tp / c][tp % c] = temp[tp]; 
        }
        return ans;
    }
}