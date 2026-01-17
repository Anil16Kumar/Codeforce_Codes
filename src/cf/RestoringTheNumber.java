package cf;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class RestoringTheNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[], int[]> func = arr -> {
            int max = Arrays.stream(arr).max().orElse(0);

            return Arrays.stream(arr)
                    .filter(x -> x != max)
                    .map(x -> max - x)
                    .toArray();
        };

        int[] answer=func.apply(new int[]{scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt()});

        for(int val:answer)
            System.out.print(val+" ");
    }
}
