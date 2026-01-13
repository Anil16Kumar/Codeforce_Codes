package cf;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long s = sc.nextLong(); // sand duration
            long k = sc.nextLong(); // flip interval
            long m = sc.nextLong(); // leave time

            long r = m % k; // time since last flip
            long result = Math.max(0, s - r);

            System.out.println(result);
        }
    }
}


//6
//        8 8 12
//        5 10 17
//        12 2 3
//        16 7 7
//        1 1 10
//        2 60 15
//        -------------------
//        4
//        0
//        1
//        7
//        1
//        0