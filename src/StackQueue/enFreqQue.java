package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class enFreqQue {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();

        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++)
            que.add(scanner.nextInt());

        System.out.println(que.peek());
        que.poll();
        System.out.println(que.size());

        int temp=que.size();
        while(temp--!=0){
            int val=que.poll();
            que.add(val);
        }
        System.out.println(que);
    }
}
