package _2_15_2021;

public class Main {
    public static void main(String[] args) {
withoutTen(new int []{2,10,10,10,3,10});
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
    public static void withoutTen(int [] arr){
        int i=0;
        while (i<arr.length&&arr[i]!=10)
            i++;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]!=10){
                arr[i]=arr[j];
                arr[j]=10;

            }
        }
        for (int i1 = 0; i1 <arr.length ; i1++) {
            if (arr[i1]==10)
                arr[i1]=0;
        }
        for (int i2 = 0; i2 < arr.length; i2++) {
            System.out.print(arr[i2]+" ");
        }
    }
}
