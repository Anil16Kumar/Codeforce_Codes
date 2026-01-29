package cf;
import java.util.Scanner;

public class SeatingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();

            int total = 0;

            for (char c : s) {
                if (c == '1') total++;
            }

            for (int i = 0; i < n; i++) {
                if (s[i] == '0') {
                    boolean leftEmpty = (i == 0 || s[i - 1] == '0');
                    boolean rightEmpty = (i == n - 1 || s[i + 1] == '0');

                    if (leftEmpty && rightEmpty) {
                        s[i] = '1';
                        total++;
                    }
                }
            }

            System.out.println(total);
        }

        sc.close();
    }
}
