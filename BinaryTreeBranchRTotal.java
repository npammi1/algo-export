package com.luv2code;

import java.util.*;

public class BinaryTreeBranchRTotal {

    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> sumOfTreeBranches = new ArrayList<Integer>();
        int currentSum =0;
        calculateBranchSums(root, currentSum, sumOfTreeBranches);
        return sumOfTreeBranches;
    }

    public static void calculateBranchSums(BinaryTree node, int currentSum, List<Integer> sumOfTreeBranches) {

        if (node == null) {
            return ;
        }

        currentSum = currentSum + node.value;
        if (node.left == null && node.right == null) {
            sumOfTreeBranches.add(currentSum);
            return;
        }
        calculateBranchSums(node.left, currentSum, sumOfTreeBranches);
        calculateBranchSums(node.right, currentSum, sumOfTreeBranches);
    }

}
