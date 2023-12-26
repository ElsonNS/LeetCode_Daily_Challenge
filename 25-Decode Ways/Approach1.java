class Solution {
    public int numDecodings(String s) {
        Map<Integer, Integer> countMap = new HashMap<>();
        return countWays(s, 0, countMap);
    }

    public int countWays(String s, int index, Map<Integer, Integer> countMap) {
        if (countMap.containsKey(index)) return countMap.get(index);
        int ways = 0;
        
        if (index < s.length()) {
            int a1 = s.charAt(index) - '0';
            if (a1 >= 1 && a1 <= 26) ways += countWays(s, index + 1, countMap);
            
            if (a1 != 0 && index + 1 < s.length()) {
                int a2 = Integer.parseInt(s.substring(index, index + 2));
                if (a2 >= 1 && a2 <= 26) ways += countWays(s, index + 2, countMap);
            }
            countMap.put(index, ways);
            return ways;
        } else {
            return 1;
        }
    }
}
