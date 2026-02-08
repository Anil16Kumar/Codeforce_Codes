package cf;

import java.util.Scanner;

public class equakPir {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        String str=scanner.next();
        for(int i=1;i<num;i++)
            if(str.charAt(i-1)==str.charAt(i))
                count++;
        System.out.println(count);
    }
}
