package cf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class InrestingDrink {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] bottlePrice=new int[n];

        for(int i=0;i<n;i++)
            bottlePrice[i]=scanner.nextInt();
        Arrays.sort(bottlePrice);

        int numberOfDays=scanner.nextInt();
        while(numberOfDays--!=0){
            int amountForTheDay=scanner.nextInt();
            System.out.println(BinarySearch(bottlePrice, amountForTheDay));
        }

    }

    public static int BinarySearch(int[] Arr, int target){
        int left = 0, right=Arr.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Arr[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;//System.out.println(left);
    }
}
