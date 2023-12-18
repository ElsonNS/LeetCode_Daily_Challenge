import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Approach1{
    public static void main(String[] args) 
    throws IOException
    {
        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int num[] = new int[10];

        String[] strNums;
        System.out.println("Enter the number separated by space");
        
        // Reading input a string
        strNums = bi.readLine().split(" ");

        //String being parsed to array using for loop 
        //String is converted into Integer
        for (int i = 0; i < strNums.length; i++)
        {
            num[i] = Integer.parseInt(strNums[i]);
        }
        int result = maxProductDiff(num);
        System.out.println(result);
        //Maximum product difference between two pairs
        /*
          product difference between two pairs (a, b) and (c, d)
          such that (a*b)-(c*d) is maximum.
         */
    }

    public static int maxProductDiff(int[] nums)
    {
        Arrays.sort(nums);
        int pair2 = nums[0]*nums[1];
        int pair1 = nums[nums.length-1]*nums[nums.length-2];
        return pair1-pair2;
    }
}