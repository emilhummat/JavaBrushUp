package _2_16_2021;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        int[] arr = leftRotation(new int[]{1, 2, 3, 4, 5}, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
/*
A left rotation operation on an array shifts each of the array's elements  unit to the left.
For example, if  left rotations are performed on array , then the array would become .
 Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
Given an array  of  integers and a number, , perform  left rotations on the array.
Return the updated array to be printed as a single line of space-separated integers.
Function Description
Complete the function rotLeft in the editor below.
rotLeft has the following parameter(s):
int a[n]: the array to rotate
int d: the number of rotations
Returns
int a'[n]: the rotated array
 */
    public static int[] leftRotation(int[] arr, int num) {
        for (int j = 0; j < num; j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
}
}
