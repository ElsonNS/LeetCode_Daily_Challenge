public class Approach2 {
    class Solution {
        public int maxProductDifference(int[] nums) {
           int firstLargest = 0, secondLargest = 0;
           int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
    
           for (int n: nums)
           {
               if(n < firstSmallest)
               {
                   secondSmallest = firstSmallest;
                   firstSmallest = n;
               }
               else if(n < secondSmallest)
               {
                   secondSmallest = n;
               }
    
               if(n>firstLargest)
               {
                   secondLargest = firstLargest;
                   firstLargest = n;
               }
               else if(n>secondLargest)
               {
                   secondLargest = n;
               }
           }
           return firstLargest*secondLargest - firstSmallest * secondSmallest;
        }
    }
}
