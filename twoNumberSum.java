package com.luv2code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class twoNumberSum {
/*    public static int[] twoNumberSum(int[] array, int targetSum) {
        int len = array.length;
        for(int i =0; i<len -1; i++) {
//            int first = array[i];
            for(int j=i+1; j<len; j++) {
                if (targetSum == (array[i] + array[j])) {
                    return new int[] {array[i],  array[j]};
                }
            }
        }
        return new int[0];
    }*/



/*    public static int[] twoNumberSum(int[] array, int targetSum) {
        int len = array.length -1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int i = 0;
//        int left = array[i];
//        int right = array[len];

        while (array[i] < array[len]) {
            if ((array[i] + array[len]) == targetSum) {
                return new int[] {array[i], array[len]};
            } else if ((array[i] + array[len]) < targetSum) {
//                i = i+1;
                i++;
                System.out.println("i is : " + i);
            } else if ((array[i] + array[len]) > targetSum) {
//                len = len -1;
                len--;
                System.out.println("len is : " +len);
            }
        }

        return new int[0];
    }*/

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Set<Integer> lookUpSecondNum = new HashSet<>();
        int len = array.length;
        for (int num : array) {
            System.out.println(num);
            int secondNumber = targetSum - num;
            if (lookUpSecondNum.contains(secondNumber)) {
                return new int[] {num, secondNumber};
            } else {
                lookUpSecondNum.add(num);
            }
        }

        return new int[0];
    }

}
