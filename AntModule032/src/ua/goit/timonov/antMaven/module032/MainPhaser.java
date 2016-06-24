package ua.goit.timonov.antMaven.module032;

import java.util.Arrays;

/**
 * console implementation of phaser
 */
public class MainPhaser {
    public static void main(String[] args) {

        InputValues inputValues = new InputValues();
        inputValues.input();
        int nElements = inputValues.getnElements();
        int nThreads = inputValues.getnThreads();
        int[] values = new int[nElements];
        for (int i = 0; i < nElements; i++) {
            values[i] = i;
        }
        SquareSum squareSum = new PhaserSquareSum();
        long result = squareSum.getSquareSum(values, nThreads);

        outputResults(nThreads, values, result);
    }

    private static void outputResults(int numberOfThreads, int[] values, long result) {
        System.out.println("Values in array: ");
        System.out.println(Arrays.toString(values));
        System.out.println("Number of threads: " + numberOfThreads);
        System.out.println("Square sum is " + result);
    }


}
