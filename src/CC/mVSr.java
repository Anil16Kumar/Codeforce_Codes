package CC;

import java.util.Scanner;
import java.util.function.Function;

public class mVSr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] A=new int[4];
        for(int i=0;i<4;i++)
            A[i]=scanner.nextInt();

        Function<int[],String> fun=arr->((arr[0]*2)+arr[1]) - ((arr[2]*2)+arr[3])==0 ? "Equal":
                ((arr[0]*2)+arr[1]) > ((arr[2]*2)+arr[3]) ? "Messi" : "Ronaldo";

        System.out.println(fun.apply(A));
    }
}
