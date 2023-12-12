class Solution {
    public int maxProduct(int[] nums) {
        int maximum = 0;
        int secondMaximum = 1;
        if (nums.length == 2)
        {
            return ((nums[maximum]-1) * (nums[secondMaximum]-1));
        }

        for (int i = 1; i < nums.length; i++)
        {
            if(nums[i] > nums[maximum])
            {
                maximum = i;
            }
        }

        if(maximum == secondMaximum)
        {
            secondMaximum++;
        }

        for (int j = 0; j < nums.length; j++)
        {
            if (nums[maximum] >= nums[j] && nums[j] > nums[secondMaximum] && maximum != j)
            {
                secondMaximum = j;
            }
        }
        return ((nums[maximum] -1) * (nums[secondMaximum] - 1));
    }
}

/*
  Edge Cases figured out 
  1. If array contain maximum number two times i.e [1,5,4,5]
  2. If the initialised secondMaximum is the maximum of array than we need to update it. 
 */
