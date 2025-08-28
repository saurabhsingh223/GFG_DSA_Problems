/* 
 Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. Return true if such a triplet exists, otherwise, return false.

Examples:

Input: arr[] = [0, -1, 2, -3, 1]
Output: true
Explanation: The triplet [0, -1, 1] has a sum equal to zero.

Input: arr[] = [1, 2, 3]
Output: false
Explanation: No triplet with a sum of zero exists.

Input: arr[] = [-5, 3, 2, -1, 0, 1]
Output: true
Explanation: The triplet [-5, 3, 2] has a sum equal to zero.
*/

class triplet_with_sum_Zero {
    public boolean findTriplets(int[] arr) {
        // code here.
        int n = arr.length;
        for(int i = 0; i<n-2; i++){
            for(int j = i+1;j<n-1; j++ ){
                for(int k = j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}