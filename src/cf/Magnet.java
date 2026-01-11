package cf;

import java.util.Objects;
import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        String temp="";
        while(n--!=0){
            String curr=scanner.next();
            if(!Objects.equals(curr, temp)){
                temp=curr;
                count++;
            }
        }
        System.out.println(count);
    }
}
