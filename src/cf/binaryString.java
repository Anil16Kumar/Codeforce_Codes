package cf;

import java.util.Scanner;

public class binaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean aliceWins = false;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                    System.out.println("Alice");
                    System.out.println(2);
                    System.out.println((i + 1) + " " + (i + 2));
                    aliceWins = true;
                    break;
                }
            }

            if (!aliceWins) {
                System.out.println("Bob");
            }
        }
        sc.close();
    }
}
