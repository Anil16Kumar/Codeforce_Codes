package cf;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int answer=0;
        int tempCount=0;

        while(n--!=0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();

            if(a+b+c>=2)
                answer++;
        }

        System.out.println(answer);
    }
}
