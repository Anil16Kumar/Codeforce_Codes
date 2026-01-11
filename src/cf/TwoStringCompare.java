package cf;

import java.util.Scanner;

public class TwoStringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int temp = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (  str1.charAt(i) != str2.charAt(i) ) {
                if (str1.charAt(i) < str2.charAt(i)){
                    temp = -1;
                    break;
                }
                else{
                    temp = 1;
                    break;
                }

            }
        }
        System.out.println(temp);

    }
}
