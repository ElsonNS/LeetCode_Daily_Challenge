class Solution {
    public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int cookiesIndex = 0;
    int satisfiedChildren = 0;
    while (cookiesIndex < s.length && satisfiedChildren < g.length)
    {
        if (s[cookiesIndex] >= g[satisfiedChildren])
        {
            satisfiedChildren++;
        }
        cookiesIndex++;
    }
    return satisfiedChildren;
    }
}
