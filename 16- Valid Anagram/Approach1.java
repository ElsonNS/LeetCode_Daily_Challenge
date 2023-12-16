import java.util.Scanner;
class validAnagram{
    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] map = new int[26];
        for (char c: s.toCharArray())
        {
            map[c-'a']++;
        }
        for (char c: t.toCharArray())
        {
            map[c-'a']--;
        }
        for (int i : map)
        {
            if (i != 0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s = scanner.next();
        System.out.println("Enter string 2");
        String t = scanner.next();
        boolean result = isAnagram(s, t);
        scanner.close();
        System.out.println("Let's see wheather it is an anagram or not : "+ result);

    }
}