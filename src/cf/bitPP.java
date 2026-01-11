package cf;

import java.util.Scanner;

public class bitPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        int X=0;
        while(n--!=0){
            String operation=scanner.next();
            switch (operation){
                case "X++" -> X++;
                case "++X" -> ++X;
                case "X--" -> X--;
                case "--X" -> --X;
            }
        }
        System.out.println(X);
    }
}
