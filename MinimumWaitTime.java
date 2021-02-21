package com.luv2code;

import java.util.Arrays;

public class MinimumWaitTime {

    public static void main(String[] args) {
        int[] queries = new int[] {1, 2, 4, 5, 2, 1};
//        int[] queries = new int[] {3,2,1,2,6};
        int output = minimumWaitingTime(queries);
        System.out.println(output);
    }

    public static int minimumWaitingTime(int[] queries) {
        int totalWaitTime = 0;
        int len = queries.length;
        Arrays.sort(queries);
        System.out.println(queries.toString());
//        for (int value : queries) {
        for (int i=0; i<len; i++) {
            totalWaitTime = totalWaitTime + (len - (i+1)) * queries[i];
        }
        return totalWaitTime;
    }


}
