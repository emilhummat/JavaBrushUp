package _2_13_2021;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
        FizzBuzz(5, 10);
        System.out.println(IsEverywhere(new int[]{1, 2, 1, 3, 1}, 1));
        System.out.println(hasThree(new int []{1,3,4,3,3,6}));
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
    public static boolean IsEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;
    }
    /*

Given an array of ints, return true if the value 3 appears in the array
 exactly 3 times, and no 3's are next to each other.
haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
     */
    public static boolean hasThree(int []arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==3)
                count++;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==3&&arr[i+1]==3||count!=3)
                return false;
        }
        return true;
    }
}
