class Solution{
    public int countCharacters(String[] words, String chars){
        int[] counts = new int [26];
        for (int i = 0; i < chars.length(); i++) {
            counts[chars.charAt(i)-'a']++;
        }
        int result = 0;
        for (String s: words)
        {
            if(wordCompare(s, counts))
            {
                result +=s.length();
            }
        }
        return result;
    }
    boolean wordCompare(String word, int[] counts){
        int [] c = new int[26];
        for (int i = 0; i <word.length(); i++)
        {
            int x = word.charAt(i)-'a';
            c[x]++;
            if(c[x]>counts[x])
            {
                return false;
            }
        }
        return true;
    }
}
