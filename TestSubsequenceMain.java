package com.luv2code;

import java.util.Arrays;
import java.util.List;

public class TestSubsequenceMain {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);

//        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        List<Integer> sequence = Arrays.asList(1);
//        List<Integer> sequence = Arrays.asList(5,1,22,25,6,-1,8,10);

        Boolean validSubsequence = SubSequence.isValidSubsequence(array, sequence);
        System.out.println(validSubsequence);
    }
}
