package twoPointers;

import java.util.*;

public class intersectionOf2array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0){
            int n=scanner.nextInt();
            int[] A=new int[n];
            for(int i=0;i<n;i++)
                A[i]=scanner.nextInt();

            int m=scanner.nextInt();
            int[] B=new int[m];
            for(int i=0;i<m;i++)
                B[i]=scanner.nextInt();

            System.out.println("2 loops: "+intersectUsing2Loop(A,B));
            System.out.println("using set: "+intersectUsingSet(A,B));
            System.out.println("seen hash set: "+intersectIsPresentHashSet(A,B));
            System.out.println("2 pointer: "+intersectionOf2array2pointer(A,B));
        }

    }

    private static ArrayList<Integer> intersectionOf2array2pointer(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> answer=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if(!answer.contains(a[i]))
                    answer.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
                i++;
            else
                j++;

        }
        return answer;
    }

    private static ArrayList<Integer> intersectUsing2Loop(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    if (!res.contains(a[i])) {
                        res.add(a[i]);
                    }
                }
            }
        }
        return res;
    }

    private static ArrayList<Integer> intersectIsPresentHashSet(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> seenMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j] && !seenMap.containsKey(a[i])) {
                    result.add(a[i]);
                    seenMap.put(a[i], 1);
                }
            }
        }
        return result;
    }


    private static ArrayList<Integer> intersectUsingSet(int[] a, int[] b) {

        Set<Integer> s1 = new HashSet<>();
        for(int val:a)
            s1.add(val);

        Set<Integer> s2 = new HashSet<>();
        for(int val:b)
            s2.add(val);

        ArrayList<Integer> res = new ArrayList<>();

        for(int val:s1){
            if( s2.contains(val))
                res.add(val);
        }
        return res;
    }


}
