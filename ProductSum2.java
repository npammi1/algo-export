package com.luv2code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum2 {
    public static void main(String[] args) {
 /*       List<Object> list = new ArrayList<Object>(
                Arrays.asList(
                        5,
                        2,
                        new ArrayList<Object>(Arrays.asList(7, -1)),
                        3,
                        new ArrayList<Object>(Arrays.asList(
                                6,
                                new ArrayList<Object>(Arrays.asList(-13, 8)),
                                4))
                )
        );*/

        List<Object> list = new ArrayList<Object>(
                Arrays.asList(
                        new ArrayList<Object>(Arrays.asList(
                                new ArrayList<Object>(Arrays.asList(
                                        new ArrayList<Object>(Arrays.asList(
                                                new ArrayList<Object>(Arrays.asList(5
                                        ))
                                ))
                ))
                        ))
        ));

        System.out.println(list);
        int total = productSum(list);
        System.out.println(total);
    }

    public static int productSum(List<Object> array) {
        int sum = 0;
        int multiplier =1;
        int increment = 0;

        sum = sum + productSumHelper(array, multiplier, increment);

/*
        for (Object ob : array) {
            System.out.println(ob);
*/


/*            if (ob instanceof Integer) {
                sum = sum + multiplier * (int) ob;
                System.out.println("Method if Mult " + multiplier);
            } else  {
                sum = sum + productSumHelper(ob, multiplier, increment);
                System.out.println("final sum " + sum);
                System.out.println("Method else Mult " + multiplier);
            }*/
/*        }*/
        return sum;
    }

    public static int productSumHelper(Object object, int multiplier, int increment) {
        increment++;
        multiplier = multiplier * (increment);
        ArrayList arrayList = new ArrayList();
        arrayList = (ArrayList) object;
        int objectSum = 0;
        for (Object miniob : arrayList) {
            if (miniob instanceof Integer) {
                objectSum = objectSum + multiplier * (int) miniob;
                System.out.println("Helper if " + object);
                System.out.println("Helper if Mult " + multiplier);
            } else {
                objectSum = objectSum +  productSumHelper(miniob, multiplier, increment);
                System.out.println("Helper else " + object);
                System.out.println("Helper else Mult " + multiplier);
            }
        }
        return objectSum;
    }
}


