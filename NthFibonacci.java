package com.luv2code;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NthFibonacci {

    public static void main(String[] args) {
        int NthNumber = 9;
        System.out.println(getNthFib(NthNumber));
    }

    //to find nth Fibonacci #
/*    public static int getNthFib(int nthNumber) {
        int i = 0;
        int[] FibNumberIs = new int[nthNumber];
        while (i < nthNumber) {
            if (i == 0) {
                FibNumberIs[i] = 0;
            } else if (i == 1) {
                FibNumberIs[i] = 1;
            } else if (i < nthNumber) {
                FibNumberIs[i] = FibNumberIs[i-1] + FibNumberIs[i-2];
            }
            i++;
        }
        return FibNumberIs[i-1];
    }*/

    //to find sum of all Fibonacci # till nth element
    public static int getNthFib(int nthNumber) {
        int i = 0;
        int sum = 0;
        int[] FibNumberIs = new int[nthNumber];
        while (i < nthNumber) {
            if (i == 0) {
                FibNumberIs[i] = 0;
                sum = FibNumberIs[i];
            } else if (i == 1) {
                FibNumberIs[i] = 1;
                sum = FibNumberIs[i];
            } else if (i < nthNumber) {
                FibNumberIs[i] = FibNumberIs[i-1] + FibNumberIs[i-2];
                sum = sum + FibNumberIs[i];
            }
            i++;
        }
//        return FibNumberIs[i-1];
        return sum;
    }
}
