package com.arsatapathy.easy;

public class MountainArray {

    public static boolean validMountainArray(int[] arr) {

        if (arr.length < 3) return false;

        int current = arr[0];
        int next;

        boolean startedToIncrease = false;
        boolean startedToDecrease = false;

        for (int i = 1; i < arr.length; i++) {
            next = arr[i];

            int slope = next - current;

            if (slope > 0) {
                if (startedToDecrease) return false;

                if (!startedToIncrease) startedToIncrease = true;

            } else if(slope < 0) {
                if (!startedToIncrease) return false;

                if (!startedToDecrease) startedToDecrease = true;

            } else {
                return false;
            }

            current = next;
        }

        return startedToDecrease ;
    }
}
