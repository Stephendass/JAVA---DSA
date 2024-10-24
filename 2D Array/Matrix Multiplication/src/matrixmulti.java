
public class matrixmulti{
    public static void main(String[] args) {
        int[][] mat1 = {{1,2}, {3,4}, {5,6}};
        int[][] mat2 = {{1,2,3}, {4,5,6}};
        int[][] res = matrixMul(mat1, mat2);
        display(mat1);
        display(mat2);
        display(res);
    }
    public static int[][] matrixMul(int[][]A, int[][]B) {
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        //Multiplication is not possible on below condition
        if(c1 != r2){
            return new int[0][0];
        }
        int[][] res = new int[r1][c2];
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                int val = 0;
                for(int k = 0; k < c1; k++){
                    val += A[i][k] * B[k][j];
                }
                res[i][j] = val;
            }
        }
        return  res;
    }
    public static void display(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}