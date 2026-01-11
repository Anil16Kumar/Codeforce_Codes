package twoPointers;

import java.util.*;

class Tuple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Tuple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

public class closestSumDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- != 0) {
            int n = scanner.nextInt();

            int[] A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = scanner.nextInt();
            int target = scanner.nextInt();

            System.out.println("2 pointer using tuple: "+closestPairSum1(A, target));
            System.out.println("2 pointer: "+closestPairSum2(A, target));
        }
    }

    private static List<Integer> closestPairSum1(int[] a, int target) {

        Arrays.sort(a);
        int i = 0, j = a.length - 1;
        PriorityQueue<Tuple<Integer, Integer, Integer>> pq =
                new PriorityQueue<>(Comparator.comparingInt(Tuple::getFirst));

        while (i < j) {
            pq.add(new Tuple<>(Math.abs(target - (a[i] + a[j])), a[i], a[j]));

            if (a[i] + a[j] > target)
                j--;
            else
                i++;
        }
        //System.out.println(pq);
        int minDiff = 0;
        List<Integer> answer = new ArrayList<>();
        int diff = 0;
        int temp = Integer.MIN_VALUE;
        if (!pq.isEmpty()) {
            minDiff = pq.peek().getFirst();
            diff = Math.abs(pq.peek().getSecond() - pq.peek().getThird());
        }
        while (!pq.isEmpty() && minDiff == pq.peek().getFirst()) {
            if (diff > temp) {
                temp = diff;
                answer.clear();
                answer.add(pq.peek().getSecond());
                answer.add(pq.peek().getThird());
            }
            pq.poll();
        }
        if (answer.size() == 0)
            return Arrays.asList();
        return answer;
    }

    public static List<Integer> closestPairSum2(int[] a, int target) {
        Arrays.sort(a);
        ArrayList<Integer> answer = new ArrayList<>();
        int minimumDiff = Integer.MAX_VALUE;

        int i = 0, j = a.length - 1;

        while (i < j) {
            int currDiff = Math.abs(target - (a[i] + a[j]));

            if (currDiff < minimumDiff) {
                minimumDiff = currDiff;
                answer = new ArrayList<>(Arrays.asList(a[i], a[j]));
            }

            if ((a[i] + a[j]) == target)
                return new ArrayList<>(Arrays.asList(a[i], a[j]));

            else if ((a[i] + a[j]) < target)
                i++;

            else
                j--;
        }
        return answer;
    }
}
