package com.luv2code;
import java.util.*;

public class BSTClosestSearch {

        public static int findClosestValueInBst(BST tree, int target) {
            // Write your code here.
            int closest = 0;
            return traverseClosestValueHelper(tree, target, closest);
        }

        public static int traverseClosestValueHelper(BST tree, int target, int closest) {

            BST currentNode = tree;

            if (currentNode == null) {
                return closest;
            }
            //            BST currentNode = tree;
            while (currentNode != null) {
                if (target > currentNode.value) {
                    currentNode = currentNode.right;
                } else if (target < currentNode.value) {
                    currentNode = currentNode.left;
                } else {
                    closest = currentNode.value;
                    break;
                }

                if (Math.abs(target - closest) > (Math.abs(target - tree.value))) {
                    closest = tree.value;
                }

            }
            return closest;
            }



        class BST {
            public int value;
            public BST left;
            public BST right;

            public BST(int value) {
                this.value = value;
            }
        }
}


