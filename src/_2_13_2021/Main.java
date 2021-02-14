package _2_13_2021;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
        FizzBuzz(5, 10);
        System.out.println(IsEverywhere(new int[]{1,2,1,3,1},1));
    }

    /* Given start and end numbers, return a new array containing the sequence of
     * integers from start up to but not including end, so start=5 and end=10
     * yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
     * start number. Note that a length-0 array is valid.
     */
    public static void FizzBuzz(int start, int end) {
        int[] arr = new int[end - start];
        for (int i = start; i < end; i++) {
            arr[i - start] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.
isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */
    public static boolean IsEverywhere(int [] nums, int val){
        for (int i = 0; i < nums.length-1; i++) {
        if (nums[i]!=val&&nums[i+1]!=val)
            return false;
        }
        return true;
    }
}
