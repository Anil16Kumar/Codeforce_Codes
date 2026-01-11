package Recursion;

import java.util.Scanner;

public class SumString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0) {
            String str = scanner.next();
            System.out.println(isSumString(str));
        }
    }

    private static boolean isSumString(String str) {
        int n = str.length();

        for (int i = 1; i <= n - 2; i++) {
            String s1 = str.substring(0, i);
            if (!isValidNumber(s1)) continue;

            for (int j = i + 1; j <= n - 1; j++) {
                String s2 = str.substring(i, j);
                if (!isValidNumber(s2)) continue;

                if (isValidSumString(str, s1, s2, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isValidNumber(String s) {
        return !(s.length() > 1 && s.charAt(0) == '0');
    }

    private static boolean isValidSumString(String str, String s1, String s2, int idx) {
        if (idx == str.length()) {
            return true;
        }

        String sum = addTheString(s1, s2);
        //if (!isValidNumber(sum)) return false;

        int len = sum.length();

        if (idx + len > str.length()) return false;
        if (!str.substring(idx, idx + len).equals(sum)) return false;

        return isValidSumString(str, s2, sum, idx + len);
    }

    private static String addTheString(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}
