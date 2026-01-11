package cf;

import java.util.Scanner;

public class easyProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int answer=0;
        for(int i=0;i<n;i++){
            int val=scanner.nextInt();
            answer|=val;
        }
        System.out.println(answer==1?"HARD":"EASY");

    }
}
