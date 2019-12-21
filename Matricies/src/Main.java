/*
* Author: Aliaksandr Hladkou
*
* Executing own class Matrix with 2 integer arguments
*
* */

public class Main {
    public static void main(String[] args)
    {
        if (args.length <= 1)
        {
            System.out.println("Either no or not enough arguments provided.");
        }
        else
        {
            Matrix myMatrix = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

            genRandMatrix(myMatrix);
            myMatrix.clear();
            genUpperTriangular(myMatrix);
            myMatrix.clear();
            genLowerTriangular(myMatrix);
        }
    }

    private static void genRandMatrix(Matrix myMatrix) {
        System.out.println("Generating M x N matrix..");
        myMatrix.generateRand(10);
        System.out.println(myMatrix.toString());
    }

    private static void genUpperTriangular(Matrix myMatrix) {
        System.out.println("Generating upper triangular matrix..");
        myMatrix.upperTriangular(10);
        System.out.println(myMatrix.toString());
    }

    private static void genLowerTriangular(Matrix matrix) {
        System.out.println("Generating lower triangular matrix..");
        matrix.lowerTriangular(10);
        System.out.println(matrix.toString());
    }
}
