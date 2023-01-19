package Week04;

class A102 {
    public int[][] transpose(int[][] matrix) {

        if(matrix.length == 0)
            return new int[0][0];
        
        int columns = matrix[0].length;
        int rows = matrix.length;

        int[][] transpose = new int[columns][rows];

        for(int i = 0; i < transpose.length; i++) {

            for(int j = 0; j < transpose[0].length; j++)
                transpose[i][j] = matrix[j][i];
        }

        return transpose;   
    }
}