package cf;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long tilesAlongN = (n + a - 1) / a;
        long tilesAlongM = (m + a - 1) / a;

        System.out.println(tilesAlongN * tilesAlongM);
    }
}
