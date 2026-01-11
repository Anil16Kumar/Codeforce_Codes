package twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class from1ton_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        System.out.println("Two pointer Approach: "+slowAndFastPointer(A));
        System.out.println("Brute Force Approach: "+bruteForceApproach(A));
        System.out.println("Sorting Approach: "+sortingApproach(A));
        System.out.println("sum of natural number Approach: "+naturalNumberSumFormulaApproach(A));
        System.out.println("Hash set Approach: "+hashSetApproach(A));
        System.out.println("XOR approach: "+xorApproach(A));
        System.out.println("index value Approach: "+indexValuePresent(A));


    }

    public static int bruteForceApproach(int[] A){
        int n=A.length;

        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(A[i]==A[j])
                    return A[i];

        return -1;
    }

    public static int sortingApproach(int[] A){
        Arrays.sort(A);

        for(int i=0;i<A.length-1;i++)
            if(A[i]==A[i+1])
                return A[i];

        return -1;
    }

    public static int naturalNumberSumFormulaApproach(int[] A){

        int arraySum=0;
        for(int val:A)
            arraySum+=val;

        int n=A.length;
        long sum1toNminus1=(long)(n-1)*(n-1+1)/2;

        return arraySum-(int)sum1toNminus1;
    }


    public static int hashSetApproach(int[] A){

        HashSet<Integer> set=new HashSet<>();
        for(int val:A){
            if(set.contains(val))
                return val;
            set.add(val);
        }

        return -1;
    }

    public static int xorApproach(int[] A){

        int xorValue=0;
        for(int val:A)
            xorValue ^= val;

        int n=A.length;
        for(int i=1;i<n;i++)
            xorValue ^= i;

        return xorValue;
    }

    public static int indexValuePresent(int[] A){

        for(int i=0;i<A.length;i++){
            if(A[Math.abs(A[i])]<0)
                return Math.abs(A[i]);
            A[Math.abs(A[i])] = -A[Math.abs(A[i])];
        }

        return -1;
    }

    public static int slowAndFastPointer(int[] A){

        int slow = A[0];
        int fast = A[0];

        slow = A[slow];
        fast = A[A[fast]];

        while (slow != fast) {
            slow = A[slow];
            fast = A[A[fast]];
        }

        slow = A[0];
        while (slow != fast) {
            slow = A[slow];
            fast = A[fast];
        }

        return slow;
    }


}
