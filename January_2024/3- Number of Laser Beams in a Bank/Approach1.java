class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRowCount = 0;
        int total = 0;

        for(String row : bank)
        {
            int currRowCount = calc(row);
            if (currRowCount == 0)
                continue;
            
            total += currRowCount * prevRowCount;
            prevRowCount = currRowCount;
        }
        return total;
    }

    private int calc(String s){
        int count = 0;
        for (char c : s.toCharArray())
            count += c - '0';
        
        return count;
        
    }
}