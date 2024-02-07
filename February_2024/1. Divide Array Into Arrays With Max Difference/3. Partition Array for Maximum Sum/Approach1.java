class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        
        // Create an array to store the maximum sum for each position in the original array. 
        int[] dp = new int[n + 1]; 


        for (int i = 1; i <= n; i++) {
            // Initialize maxVal to 0 for each position i in the original array.
            int maxVal = 0; 

            for (int j = 1; j <= k && i - j >= 0; j++) { 

                // Update maxVal with the maximum value in the current subarray of length at most k.
                maxVal = Math.max(maxVal, arr[i - j]);

                // Update the maximum sum at position i by considering the current subarray.
                dp[i] = Math.max(dp[i], dp[i - j] + maxVal * j); 
            }
        }

        // Return the maximum sum after partitioning the entire array.
        return dp[n]; 
    }
}