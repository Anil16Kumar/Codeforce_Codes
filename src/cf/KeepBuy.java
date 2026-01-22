package cf;

import java.util.Scanner;

public class KeepBuy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt(), r=scanner.nextInt();
        int count=1;
        while(true){
            if((k*count)%10==r || (k*count)%10==0)
                break;

            count++;
        }
        System.out.println(count);
    }
}
