package com.luv2code;

public class testMain {
    public static void main(String[] args) {
        int[] output = twoNumberSum.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);

/*        for (int i = 0; i < output.length; i++) {
            String s = output[0] + ", " + output[1];
        }*/
        System.out.println("{" + output[0] + ", " + output[1] + "}");
    }
}
