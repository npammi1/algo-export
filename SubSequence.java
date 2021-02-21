package com.luv2code;

import java.util.List;

public class SubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int arrayLength = array.size();
        int sequenceLength = sequence.size();
        System.out.println(arrayLength + ", " + sequenceLength);
        int i = 0;
        int j = 0;
        boolean issequenceFlag = false;

        while (i < arrayLength  && j < sequenceLength) {
            if (array.get(i) == sequence.get(j)) {
                System.out.println("array value " + array.get(i));
                System.out.println("sequence value " + sequence.get(j));
                i++;
                j++;
                issequenceFlag = true;
            } else {
                System.out.println("i is " + i);
                System.out.println("array value " + array.get(i));
                i++;
            }

            if (i < arrayLength && j == sequenceLength) {
//                return issequenceFlag;
            } else if (i == arrayLength && j < sequenceLength) {
                issequenceFlag = false;
                System.out.println(issequenceFlag);
//                return issequenceFlag;
            }
        }

        return issequenceFlag;
    }
}
