import java.util.Random;

/*
 * Author: Aliaksandr Hladkou
 *
 * Generating different types of matrices
 * */

public class Matrix {
    private int[][] mat;
    private final int M;
    private final int N;

    public Matrix(int m, int n) {
        this.M = Math.abs(m);
        this.N = Math.abs(n);
        this.mat = new int[M][N];
    }

    public Matrix(int[][] matrix) {
        this.mat = matrix;
        this.M = matrix.length;
        this.N = matrix[0].length;
    }

    public void clear() {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = 0;
            }
        }
    }

    public void generateRand(int range) {
        Random rand = new Random();
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = rand.nextInt(range);
            }
        }
    }

    public void upperTriangular(int range) {
        if (this.M == this.N)
        {
            Random rand = new Random();
            for (int i = 0; i < mat.length; i++)
            {
                for (int j = i; j < mat[i].length; j++)
                {
                    mat[i][j] = rand.nextInt(range);
                }
            }
        }
        else {
            System.err.println("The upper triangular matrix must be N x N!");
        }
    }

    public void lowerTriangular(int range) {
        if (this.M == this.N)
        {
            Random rand = new Random();
            for (int i = 0; i < mat.length; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    mat[i][j] = rand.nextInt(range);
                }
            }
        }
        else {
            System.err.println("The lower triangular matrix must be N x N!");
        }
    }

    private String print() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < mat.length; i++)
        {
            builder.append("| ");
            for (int j = 0; j < mat[i].length; j++)
            {
                builder.append(mat[i][j] + " ");
            }
            builder.append("|\n");
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        return "The matrix is: \n" + print() + "\n";
    }
}