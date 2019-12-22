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
            myMatrix.clear();
            getIdentity(myMatrix);
            myMatrix.clear();
            getScalar(myMatrix, 10);
        }
    }

    private static void getScalar(Matrix matrix, int number) {
        System.out.println(String.format("Generating scalar %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.scalar(number);
        System.out.println(matrix.toString());
    }

    private static void getIdentity(Matrix matrix) {
        System.out.println(String.format("Generating identity %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.identity();
        System.out.println(matrix.toString());
    }

    private static void genRandMatrix(Matrix myMatrix) {
        System.out.println(String.format("Generating %0$s x %1$s matrix..", myMatrix.getM(), myMatrix.getN()));
        myMatrix.generateRand(10);
        System.out.println(myMatrix.toString());
    }

    private static void genUpperTriangular(Matrix myMatrix) {
        System.out.println(String.format("Generating upper triangular %0$s x %1$s matrix..", myMatrix.getM(), myMatrix.getN()));
        myMatrix.upperTriangular(10);
        System.out.println(myMatrix.toString());
    }

    private static void genLowerTriangular(Matrix matrix) {
        System.out.println(String.format("Generating lower triangular %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.lowerTriangular(10);
        System.out.println(matrix.toString());
    }
}
