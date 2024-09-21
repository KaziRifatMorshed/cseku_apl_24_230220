class BinarySearchRecursive { 

    public static int BinarySearch(int[] arr, int left_idx, int right_idx, int key) {

        /* this static method takes an array of integer, left index of 
        selected portion of the array, right index of the selected part of the array,
        and the key which we are looking for
        
        returns the index of key in the array as integer;
        but returns -1 if key is not found;
        implemented in recursive manner
        */

        if (left_idx > right_idx) {         /* base case */
            return -1;
        }

        int mid_idx = (left_idx + right_idx) / 2; /* index of the center of
                                                     the selected portion of the array */

        if (arr[mid_idx] == key) {
            return mid_idx;                 /* returns the position(index) if found */
        }

        if (key < arr[mid_idx]) {           /* recursive call */
            return BinarySearch(arr, left_idx, mid_idx - 1, key);
        } else {
            return BinarySearch(arr, mid_idx + 1, right_idx, key);
        }

    }

    public static void main(String[] args) {

        System.out.println("Hello World\nI am going to implement binary search");

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                    11, 12, 15, 20, 50, 40, 80, 99, 101};

        System.out.println("number 20 is in position: " + 
        BinarySearch(arr, 0, arr.length, 20)); 

    }

}
