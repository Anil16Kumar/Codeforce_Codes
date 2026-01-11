package cf;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String toCompare = "hello";
        int temp = 0;
        String stringTemp = "";
        for (int i = 0; i < str.length(); i++) {
            if (temp < 5 && str.charAt(i) == toCompare.charAt(temp)) {
                stringTemp += str.charAt(i);
                temp++;
            }
        }
        System.out.println(stringTemp.equals("hello") ? "YES" : "NO");

    }
}
