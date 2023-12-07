class Solution{
    public String largestOddNumber(String num){
        if((int)num.charAt(num.length() -1) % 2 == 1) return num;
        int i = num.length() -1;
        while (i >= 0)
        {
            int n - num.charAt(i);
            if ( n % 2 == 1) return num.substring(0, i+1);
            i--;
        }
        return "";
    }
}

/*
// Logic 
1 .we will first check the last index of the string if it is odd than the whole
string is odd.

2. if last index is not odd than we traverse right to left (from the end) throoughout the 
String and look for odd digit. i.e we will check for second last index than second last -1 further more.

3. If no digit is odd than we will return an empty String.
 
 */

