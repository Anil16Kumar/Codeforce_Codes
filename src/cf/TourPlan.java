package cf;

import java.util.Scanner;

public class TourPlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int w = scanner.nextInt();

        int num = 6 - Math.max(y, w) + 1; // winning outcomes
        int den = 6;

        int gcd = gcd(num, den);

        System.out.println((num/gcd) + "/" + (den/gcd));

    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
