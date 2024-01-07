class Solution {
    public int minOperations(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int operations = 0;
        for (int num : nums)
        {
            int count = hm.getOrDefault(num, 0) + 1;
            hm.put(num, count);
        }
        //Iterate through the entries in the HashMap
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            //Get the frequency count of current element 
            int t = entry.getValue();
            //if Frequency is 1 means we cannot minimise the array so we return -1
            if (t == 1)
                return -1;
            //Calculate the number of operations needed to make the frequency divisble by 3
            operations += t/3; // Count the complete sets of 3 elements
            if (t % 3 != 0) // If there are remaining elements than we will simply add them 
            // as on dividing with 3 we can only get remainder 2,1,0 so if remainder is other than 0 we simply increment the operations.
                operations++;
        }
        return operations;
    }
}