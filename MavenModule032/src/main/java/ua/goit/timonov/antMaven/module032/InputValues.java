package ua.goit.timonov.antMaven.module032;

import java.util.Scanner;

/**
 * Created by Alex on 23.06.2016.
 */
public class InputValues {
    private int nElements;
    private int nThreads;

    public int getnElements() {
        return nElements;
    }

    public int getnThreads() {
        return nThreads;
    }

    public void input() {
        System.out.println("Input nElements of elements: ");
        Scanner sc = new Scanner(System.in);
        nElements = sc.nextInt();
        System.out.println("Input nElements of threads: ");
        sc = new Scanner(System.in);
        nThreads = sc.nextInt();
    }
}