package com.luv2code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassPhotos {

    public static void main(String[] args) {
        ArrayList<Integer> redShirt = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 8, 2, 1));
        ArrayList<Integer> blueShirt = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 5, 1, 6));

        //one way to sort descending
        //        Collections.sort(redShirt);
//        Collections.reverse(redShirt);


        System.out.println(classPhotos(redShirt, blueShirt));
    }


    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.
        boolean canTakePhoto = false;
        String backGroup = null;

        //other way to sort descending
        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());

        System.out.println(redShirtHeights);
        System.out.println(blueShirtHeights);

        if (redShirtHeights.size() != blueShirtHeights.size()) {
            System.out.println("size of both row arrays different");
            return false;
        }

        backGroup = (redShirtHeights.get(0) > blueShirtHeights.get(0)) ? "red" : "blue";
        /*if (redShirtHeights.size() == blueShirtHeights.size()) {
            if (redShirtHeights.get(0).compareTo(blueShirtHeights.get(0)) == 0) {
                System.out.println("same highest value so  false : ");
                return canTakePhoto;
            } else if (redShirtHeights.get(0).compareTo(blueShirtHeights.get(0)) < 0) {
                backGroup = "blue";
            } else if (redShirtHeights.get(0).compareTo(blueShirtHeights.get(0)) > 0) {
                backGroup = "red";
            }
        } else {

            return canTakePhoto;
        }*/

        //which shirt group is back
        System.out.println("Shirt group that is back is : " + backGroup);
//        System.out.println("Temporary status is : " + canTakePhoto);

        return checkGroupPhoto(redShirtHeights, blueShirtHeights, backGroup, canTakePhoto);
    }

    private static boolean checkGroupPhoto(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights, String backGroup, boolean canTakePhoto) {
        int size = redShirtHeights.size();
        List back = new ArrayList<Integer>();
        back = (backGroup == "red") ? redShirtHeights : blueShirtHeights;
        System.out.println(back);
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            if (backGroup == "red") {
                if (redShirtHeights.get(i) <= blueShirtHeights.get(i)) {
                    return false;
                }
            } else {
                if (blueShirtHeights.get(i) <= redShirtHeights.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }



}
