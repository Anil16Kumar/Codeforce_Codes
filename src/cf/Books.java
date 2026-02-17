package cf;

import java.util.Scanner;
import java.util.function.Function;

public class Books {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int time=scanner.nextInt();

        int Arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            Arr[i]=scanner.nextInt();
            if(Arr[i]<=time){
                count++;
                time-=Arr[i];
            }
        }
        System.out.println(count);


    }
}
