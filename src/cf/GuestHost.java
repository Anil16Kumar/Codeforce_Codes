package cf;

import java.util.Scanner;

public class GuestHost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gname = scanner.next();
        String hname = scanner.next();
        String cname = scanner.next();

        int[] Arr = new int[26];
        for (int i = 0; i < gname.length(); i++)
            Arr[gname.charAt(i) - 'A']++;

        for (int i = 0; i < hname.length(); i++)
            Arr[hname.charAt(i) - 'A']++;

        for (int i = 0; i < cname.length(); i++) {
            int idx = cname.charAt(i) - 'A';
            Arr[idx]--;
            if (Arr[idx] < 0) {
                System.out.println("NO");
                return;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (Arr[i] != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");


    }
}
