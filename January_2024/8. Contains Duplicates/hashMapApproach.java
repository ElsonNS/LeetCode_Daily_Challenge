import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        Map<Integer, integer> seen = new HashMap<>();
        for (int num :  nums)
        {
            //Checking if the element of array is already present in hashmap and has frequency greater than 1 or equal to 1
            if(seen.containsKey(num) && seen.get(num) >= 1)
            {
                return true;
            }
            //Storing values of array in hashmap
            seen.put(num, seen.getOrDefault(num, 0)+1);
        }
        return false;
    }
}
