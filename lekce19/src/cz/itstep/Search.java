package cz.itstep;


import java.util.Arrays;

class Search {

    public int search(int arr[], int x) {
        if (arr == null) {
            return -1;
        }

        /* old trash...
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        */

        final int index = Arrays.binarySearch(arr, x);

        return index >= 0 ? index : -1;
    }

}
