//Binary Search
/*
 Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.

Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.

Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.
 */

import java.util.*;

 class Binary_Search {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(k == arr[mid] ){
                result = mid;
                end = mid - 1;
            }else if(k > arr[mid]){
               start = mid+1; 
            }else{
                end = mid - 1;
            }
        }
        return result;
    }
}
