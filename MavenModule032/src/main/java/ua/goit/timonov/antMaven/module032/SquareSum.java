package ua.goit.timonov.antMaven.module032;

/**
 * Evaluates square sum of elements in the array dividing overall task in given number of threads
 */
public interface SquareSum {

    long getSquareSum(int[] values, int numberOfThreads);

    int[] getElementsInSegments();
}
