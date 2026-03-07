package cf;

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),k=scanner.nextInt();
        int Arr[]=new int[n];
        for(int i=0;i<n;i++)
            Arr[i]=scanner.nextInt();

        int i=0,j=0;
        int answer=Integer.MAX_VALUE;
        int answerIdx=-1;
        int temp=0;
        while(j<n){
            int windowSize=j-i+1;
            temp+=Arr[j];
            if(windowSize<k)
                j++;
            else{
                if(temp<answer){
                    answer=temp;
                    answerIdx=i;
                }
                temp-=Arr[i];
                i++;
                j++;
            }
        }
        System.out.println(answerIdx+1);
    }
}
