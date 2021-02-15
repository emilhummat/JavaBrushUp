package _2_15_2021;

public class Main {
    public static void main(String[] args) {
        withoutTen(new int[]{2, 10, 4, 10, 10, 3, 10});
        tenRun(new int[]{2, 10, 3, 4, 20, 4, 5, 30, 1});
        System.out.println(luckySum(3, 3, 13));
        System.out.println(makeChocolate(4,1,9));
    }

    /*
    Return a version of the given array where all the 10's have been removed. The remaining
     elements should shift left towards the start of the array as needed, and the empty spaces
     at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify
     and return the given array or make a new array.
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
     */
    public static void withoutTen(int[] arr) {
        int i = 0;
        while (i < arr.length && arr[i] != 10)
            i++;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] != 10) {
                arr[i] = arr[j];
                arr[j] = 10;
                i++;
            }
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] == 10)
                arr[i1] = 0;
        }
        for (int i2 = 0; i2 < arr.length; i2++) {
            System.out.print(arr[i2] + " ");
        }
        System.out.println();
    }

    /*
For each multiple of 10 in the given array, change all the values following it to be
 that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */
    public static void tenRun(int[] arr) {
        int current, num = 0;
        while (num < arr.length && arr[num] % 10 != 0)
            num++;
        current = arr[num];
        for (int i = num + 1; i < arr.length; i++) {
            if (arr[i] % 10 == 0)
                current = arr[i];
            else arr[i] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does
    not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1
     */
    public static int luckySum(int a, int b, int c) {
        if (a == 13)
            return 0;
        if (b == 13)
            return a;
        if (c == 13)
            return a + b;
        return a + b + c;

    }

    /*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
and big bars (5 kilos each). Return the number of small bars to use, assuming we always
use big bars before small bars. Return -1 if it can't be done.
makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
     */
    public static int makeChocolate(int small, int big, int goal) {
        int remainder;
        if (goal >= big * 5)
            remainder = goal - big * 5;
        else remainder = goal % 5;
        if (remainder<=small)
            return remainder;
        else return -1;
    }
}

