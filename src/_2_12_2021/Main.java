package _2_12_2021;

public class Main {
    public static void main(String[] args) {
        DescendingOrder(new int[]{5, 7, 1, 9});
        System.out.println(PalindromeNumber(505));
    }

    public static void DescendingOrder(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean PalindromeNumber(int num) {
        int reverse = 0, remainder, a;
        a = num;
        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        System.out.println(reverse);
        return a == reverse;
    }
}
