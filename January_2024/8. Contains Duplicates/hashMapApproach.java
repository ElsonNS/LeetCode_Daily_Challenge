import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        Map<Integer, integer> seen = new HashMap<>();
        for (int num :  nums)
        {
            if(seen.containsKey(num) && seen.get(num) >= 1)
            {
                return true;
            }
            seen.put(num, seen.getOrDefault(num, 0)+1);
        }
        return false;
    }
}