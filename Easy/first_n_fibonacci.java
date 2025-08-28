/*
 First n Fibonacci
Difficulty: BasicAccuracy: 29.92%Submissions: 260K+Points: 1
Given a number n, return an array containing the first n Fibonacci numbers.

Note: The first two numbers of the series are 0 and 1.

Examples:

Input: n = 5
Output: [0, 1, 1, 2, 3]

Input: n = 7
Output: [0, 1, 1, 2, 3, 5, 8]

Input: n = 2
Output: [0, 1]
 */

 // User function Template for Java

class first_n_fibonacci {
    // Function to return list containing first n Fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] arr = new int[n];
        if (n == 0) return arr; // handle edge case
        
        arr[0] = 0;
        if (n > 1) arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2]; 
        }
        return arr;
    }
}

