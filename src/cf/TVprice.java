package cf;

import java.util.Arrays;
import java.util.Scanner;

public class TVprice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int Arr[]=new int[n];

        for(int i=0;i<n;i++)
            Arr[i]=scanner.nextInt();

        Arrays.sort(Arr);
        int money=0;

        for(int i=0;i<m;i++){
            if(Arr[i]<0)
                money+= -Arr[i];
            else
                break;
        }

        System.out.println(money);
    }
}
