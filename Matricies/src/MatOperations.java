/*
* Author: Aliaksandr Hladkou
*
* Class with matrix operations
*
* */

public class MatOperations {

    public int[][] add(int[][] a, int[][] b) {
        if ((a.length == b.length) && (a[0].length == b[0].length))
        {
            int[][] result = new int[a.length][a[0].length];

            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[i].length; j++)
                    result[i][j] = a[i][j] + b[i][j];
            return result;
        }
        else throw new RuntimeException("Check matrix dimensions");
    }

    public int[][] subtract(int[][] a, int[][] b) {
        if ((a.length == b.length) && (a[0].length == b[0].length))
        {
            int[][] result = new int[a.length][a[0].length];

            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[i].length; j++)
                    result[i][j] = a[i][j] - b[i][j];
            return result;
        }
        else throw new RuntimeException("Check matrix dimensions");
    }

    public int[][] multiply(int[][] a, int[][] b) {
        if (a[0].length == b.length)
        {
            int[][] c = new int[a.length][b[0].length];

            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < b.length; j++)
                    for (int s = 0; s < b.length; s++)
                        c[i][j] += a[i][s] * b[s][j];
            return c;
        }
        else throw new RuntimeException("Check matrix dimensions");
    }

    public int[][] scalarMultiplication(int[][] a, int scalar) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] *= scalar;
        return a;
    }

    public boolean equals(int[][] a, int[][] b) {
        if (!(a.length == b.length) || !(a[0].length == b[0].length))
            return false;
        else
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[i].length; j++)
                    if (a[i][j] != b[i][j])
                        return false;
        return true;
    }

    public void clear(int[][] a) {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = 0;
            }
        }
    }
}
