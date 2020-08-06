/*
    Brute force solution
    
    Time Complexity: O(N*K), where N is the number of elements in input array 'arr'
    
    (from "Grokking the Coding Interview: Patterns for Coding Questions", Educative.io) 
*/

public class MaxSumSubArrayOfSizeK_BF {

    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0, windowSum;
        
        for (int i = 0; i <= arr.length - k; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
            + findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
            + findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
    
}
