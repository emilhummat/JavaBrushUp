package _2_16_2021;

public class HackerRank1 {
    public static void main(String[] args) {
        newYearChaos(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }

    public static void newYearChaos(int[] q) {
        int bribe = 0;
        boolean chaotic = false;
        for(int i = 0; i < q.length; i++)
        {
            if(q[i]-(i+1) > 2)
            {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i]-1-1); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        if(chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
//        int count = 0;
//        boolean chaotic = false;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] - arr[j] > 2)
//                    chaotic = true;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//
//            if (!chaotic) {
//                if (arr[i] - arr[i + 1] == 1)
//                    count++;
//                else if (arr[i] - arr[i + 1] == 2)
//                    count += 2;
//            }
//        }
//        if (chaotic) System.out.println("Too chaotic");
//        else
//            System.out.println(count);
    }
}
