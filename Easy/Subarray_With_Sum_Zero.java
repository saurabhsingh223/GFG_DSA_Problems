//Subarray with sum zero

/*
  Input: arr[] = [4, 2, -3, 1, 6]
  Output: true
  Explanation: 2, -3, 1 is the subarray with a sum of 0.
 */

class Subarray_With_Sum_Zero {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum == 0) return true;
            }
        }
        return false;
    }
}