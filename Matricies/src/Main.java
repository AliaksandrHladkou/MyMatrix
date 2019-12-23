/*
* Author: Aliaksandr Hladkou
*
* Executing own class Matrix with 2 integer arguments
*
* */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        if (args.length <= 1)
        {
            System.out.println("Either no or not enough arguments provided.");
        }
        else
        {
            MatOperations operation = new MatOperations();
            Matrix[] matrices = new Matrix[5];

            for (int i = 0; i < matrices.length; i++)
                matrices[i] = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

            genAndPrintScalar(matrices[0], 5);
            genAndPrintLowerTriangular(matrices[1]);
            genAndPrintUpperTriangular(matrices[2]);
            genAndPrintRandMatrix(matrices[3]);
            genAndPrintIdentity(matrices[4]);

            int[][] subResult = operation.subtract(matrices[3].getMat(), matrices[0].getMat());
            int[][] addResult = operation.add(matrices[1].getMat(), matrices[2].getMat());
            int[][] multResult = operation.multiply(matrices[4].getMat(), matrices[0].getMat());

            printResult(subResult);
            printResult(addResult);
            printResult(multResult);
        }
    }

    private static void printResult(int[][] c)
    {
        System.out.println("The result of matrix operation is: ");
        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void genAndPrintScalar(Matrix matrix, int number) {
        System.out.println(String.format("Generating scalar %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.scalar(number);
        System.out.println(matrix.toString());
    }

    private static void genAndPrintIdentity(Matrix matrix) {
        System.out.println(String.format("Generating identity %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.identity();
        System.out.println(matrix.toString());
    }

    private static void genAndPrintRandMatrix(Matrix matrix) {
        System.out.println(String.format("Generating %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.generateRand(10);
        System.out.println(matrix.toString());
    }

    private static void genAndPrintUpperTriangular(Matrix matrix) {
        System.out.println(String.format("Generating upper triangular %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.upperTriangular(10);
        System.out.println(matrix.toString());
    }

    private static void genAndPrintLowerTriangular(Matrix matrix) {
        System.out.println(String.format("Generating lower triangular %0$s x %1$s matrix..", matrix.getM(), matrix.getN()));
        matrix.lowerTriangular(10);
        System.out.println(matrix.toString());
    }
}
