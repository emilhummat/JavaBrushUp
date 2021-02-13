package _2_12_2021;

public class Main {
    public static void main(String[] args) {
        DescendingOrder(new int[]{5, 7, 1, 9});
    }
    public static void DescendingOrder(int [] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
