package StringPrac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StringArraySortingLengthL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = scanner.nextLine();
        }

        Arrays.sort(strArr, Comparator.comparingInt(String::length));

        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
