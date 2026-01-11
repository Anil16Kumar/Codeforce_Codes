package twoPointers;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();

        int target=scanner.nextInt();

        int answer=twoSumFunction(arr,target);
        System.out.println(answer);
    }

    private static int twoSumFunction(int[] arr, int target) {

        int n=arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr) {
            if(mp.containsKey(i))
                mp.put(i,mp.get(i)+1);
            else
                mp.put(i,1);
        }
        List<Integer> lst=new ArrayList<>();


        for(int key:mp.keySet()){
            if(mp.get(key)==2)
                return key;
        }

        return  -1;
    }
}
