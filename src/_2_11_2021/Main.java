package _2_11_2021;

public class Main {
    public static void main(String[] args) {
        System.out.println(ReverseString("crazy"));
        System.out.println(Sum(-5));
        System.out.println(DigitSum(-1173));
        System.out.println(Factorial(0));
        System.out.println(ReverseNumber(117));
        System.out.println(ReverseNumberAlt(117));
    }

    public static String ReverseString(String text) {
        String str = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            str += text.charAt(i);
        }
        return str;
    }

    public static int Sum(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= n; i--) {
                sum += i;
            }
        }
        return sum;
    }

    public static int DigitSum(int num) {
        int sum = 0;

        while (num % 10 != 0) {
            int remainder = num % 10;
            num = num / 10;
            sum += remainder;
        }
        return sum;
    }

    public static int Factorial(int n) {
        int fac = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
        } else if (n < 0) {
            for (int i = -1; i >= n; i--) {
                fac *= i;
            }
        } else return 1;
        return fac;
    }

    public static int ReverseNumber(int n) {
        int a = 0;
        while (n > 0) {
            int remainder = n % 10;
            n /= 10;
            a = a * 10 + remainder;
        }
        return a;
    }

    public static int ReverseNumberAlt(int n){
        String str=String.valueOf(n);
        String reverseNum="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseNum+=str.charAt(i);
        }
        return Integer.parseInt(reverseNum);
    }
}