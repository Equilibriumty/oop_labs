package Lab2;

import java.util.Random;
import java.util.Scanner;

/**
 * C5 (9313 mod 5) = 3 (C = A⊕B);
 * C7 (9313 mod 7) = 3 (int);
 * C11 (9313 mod 11) = 7 (Обчислити суму найбільших елементів в стовпцях матриці
 * з непарними номерами та найменших елементів в стовпцях матриці з парними номерами)
 **/
public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input m: ");
        int m = sc.nextInt();
        System.out.print("Input n: ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];
        double S = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = randomNumbers();

            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = randomNumbers();

            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] ^ B[i][j];

            }
        }
        System.out.println("Matrix A: ");
        printMatrix(A);
        System.out.println("Matrix B: ");
        printMatrix(B);
        System.out.println("Matrix C: ");
        printMatrix(C);
        System.out.println("Min in (2*n)+1: ");
        smallestInCol(C, n, m);
        System.out.println("Max in 2*n: ");
        biggestInCol(C, n, m);
    }


    public static int randomNumbers() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (String.valueOf(A[i][j]).length() < 2) {
                    System.out.print(" " + A[i][j] + " ");
                } else {
                    System.out.print(A[i][j] + " ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }


    public static void smallestInCol(int C[][], int n, int m) {

        System.out.print(" { ");
        int sum = 0;
        for (int i = 0; i < m; i++) {

            int minm = C[0][i];

            for (int j = 1; j < m; j++) {

                if (C[j][i] < minm) {
                    minm = C[j][i];
                }
            }
            sum += minm;
            System.out.print(minm + ", ");
        }

        System.out.println("The sum is: " + sum);
        System.out.print("}");
        System.out.println();
    }


    public static void biggestInCol(int[][] C, int n, int m) {

        System.out.print(" { ");
        int sum = 0;
        for (int i = 0; i < m; i++) {

            int maxm = C[0][i];


            for (int j = 1; j < m; j++) {

                if (C[j][i] > maxm) {
                    maxm = C[j][i];
                }
            }
            sum += maxm;
            System.out.print(maxm + ", ");

        }
        System.out.println("The sum is: " + sum);
        System.out.print("}");
    }
}
