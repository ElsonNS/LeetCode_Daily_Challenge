class Solution {
    public int search(int[] nums, int target) {
        // Taking left pointer as l and right pointer as r      // l is at start of array  while r is at end of array
      int l = 0;
      int r = nums.length - 1;
      //checking till l does not overlapes r
      while (l <= r)
      {
          int mid = l + (r - l)/2;
          //Checking if number is present at the mid of array
          if (nums[mid] == target)
          {
              return mid;
          }
          // If target is greater that means we are sure that element is not present between l and mid so we will check now from mid + 1 to end of array
          if (nums[mid] < target)
          {
              l = mid + 1;
          }
          else
          // target is smaller than mid hence it will be from start to mid -1 of array
          {
             r = mid - 1;
          }
      }
      //If element is not present we return -1
      return -1;
    }
}
// Iterative Approach