package cf;

import java.util.Scanner;

public class BobBrotherweight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int count=0;
        while(a<=b){
            a*=3;
            b*=2;
            count++;
        }
        System.out.println(count);
    }
}
