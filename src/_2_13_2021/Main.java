package _2_13_2021;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
        FizzBuzz(5, 10);
        System.out.println(IsEverywhere(new int[]{1, 2, 1, 3, 1}, 1));
        System.out.println(hasThree(new int[]{1, 3, 4, 3, 3, 6}));
        preFour(new int[]{1, 3, 5, 4, 2, 4});
        notAlone(new int[]{1,2,3,2,5,2},2 );
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
    public static boolean hasThree(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3)
                count++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 3 && arr[i + 1] == 3 || count != 3)
                return false;
        }
        return true;
    }

    /*

Given a non-empty array of ints, return a new array containing the elements from the
original array that come before the first 4 in the original array. The original array
will contain at least one 4. Note that it is valid in java to create an array of length 0.
pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
     */
    public static void preFour(int[] arr) {
        int count = 0;
        while (arr[count]!=4)
                count++;
        int[] newArr = new int[count];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

    }
/*
We'll say that an element in an array is "alone" if there are values before and after it,
and those values are different from it. Return a version of the given array where every
instance of the given value which is alone is replaced by whichever value to its left or right is larger.
notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
 */

    public static void notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val&&i!=0&&i!=nums.length-1&&nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])
               nums[i]=Math.max(nums[i-1],nums[i+1]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
