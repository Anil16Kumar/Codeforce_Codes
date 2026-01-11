package StackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Optional: Override toString for better print representation
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}


public class nearestSmallTower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        int[] answer=nearestSmallTowerHelp(A);
        for(int val:answer)
            System.out.println(val);
    }

    private static int[] nearestSmallTowerHelp(int[] a) {

        ArrayList<Integer> left2right=new ArrayList<>();
        Stack<Pair<Integer, Integer>> stk=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!stk.empty() && stk.peek().getKey()>=a[i]){
                stk.pop();
            }

            if(stk.empty()){
                left2right.add(-1);
                stk.add(new Pair<>(a[i],i));
            }

            else if(stk.peek().getKey()<a[i]){
                left2right.add(stk.peek().getValue());
                stk.add(new Pair<>(a[i],i));
            }
        }


        Stack<Pair<Integer, Integer>> stk2=new Stack<>();
        ArrayList<Integer> right2left=new ArrayList<>();
        for(int i=a.length-1;i>=0;i--){
            while(!stk2.empty() && stk2.peek().getKey()>=a[i]){
                stk2.pop();
            }

            if(stk2.empty()){
                right2left.add(-1);
                stk2.add(new Pair<>(a[i],i));
            }

            else if(stk2.peek().getKey()<a[i]){
                right2left.add(stk2.peek().getValue());
                stk2.add(new Pair<>(a[i],i));
            }
        }
        Collections.reverse(right2left);

//        System.out.println();
//        for(int val:left2right)
//            System.out.print(val+" ");
//        System.out.println();
//        for(int val:right2left)
//            System.out.print(val+" ");
        int[] answer=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(left2right.get(i) == -1 && right2left.get(i)==-1)
                answer[i]=-1;

            else if(left2right.get(i) == -1 || right2left.get(i)==-1){
                answer[i] = left2right.get(i) != -1 ?
                        left2right.get(i)  :  right2left.get(i) ;
            }
            else{
                int left=Math.abs(i-left2right.get(i));
                int right=Math.abs(i-right2left.get(i));

                if(right<left){
                    answer[i]=right2left.get(i);
                }
                else{
                    if(left<right)
                        answer[i]=left2right.get(i);
                    else{
                        if(a[left2right.get(i)]>a[right2left.get(i)])
                         answer[i]=right2left.get(i);
                        else
                            answer[i]=left2right.get(i);
                    }

                }
            }
        }

        return answer;
    }

}

