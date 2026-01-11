package cf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//class Pair<K,V>{
//    K k;
//    V v;
//
//    public Pair(K u, V v) {
//        this.k = u;
//        this.v = v;
//    }
//
//    public K getKey() {
//        return k;
//    }
//
//    public V getValue() {
//        return v;
//    }
//
//    @Override
//    public String toString() {
//        return "Pair{" +
//                "k=" + k +
//                ", v=" + v +
//                '}';
//    }
//}

public class BirthdayPresent {
    static class Pair<K,V>{
        K k;
        V v;

        public Pair(K u, V v) {
            this.k = u;
            this.v = v;
        }

        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "k=" + k +
                    ", v=" + v +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Pair[] arr=new Pair[n+1];
        for(int i=1;i<n+1;i++){
            int val=scanner.nextInt();
            arr[i]=new Pair(val,i);
        }

        Arrays.sort(arr, 1, n + 1);

        int[] answer=new int[n];
        for(int i=1;i<n+1;i++)
            System.out.println(arr[i].getValue()+" ");


    }
}
