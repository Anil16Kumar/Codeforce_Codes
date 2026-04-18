package CC.Collection;

import java.util.*;

public class Prac3 {
    public static void main(String[] args) {

        String str9="annddasju";
        Map<Character,Integer> mp0=new LinkedHashMap<>();
        for(char val:str9.toCharArray())
            mp0.put(val,mp0.getOrDefault(val,0)+1);
        for(char val :str9.toCharArray())
            if(mp0.get(val)==1){
                System.out.println("1st non repeting characte in string: "+ val);
                break;
            }

        List<Integer> lst7=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("even count: "+
                lst7.stream().filter(val->val%2==0).count()
        );

        List<Integer> lst6=new ArrayList<>(Arrays.asList(1,21,22,12,90,121));
        int max=Integer.MIN_VALUE;
        for(int val:lst6)
            if(val>max)
                max=val;
        System.out.println("maximum value inside the lst: "+max);

        Deque<Integer> dq=new ArrayDeque<>(Arrays.asList(1,2,3,3));
        dq.addFirst(100);
        dq.addLast(200);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(12);
        pq.add(33);
        pq.add(1);
        pq.add(90);
        System.out.println("top: "+ pq.peek());
        while(!pq.isEmpty()){
            System.out.println("pq size:-> "+pq.size() +", "+pq.poll());
        }

        Queue<Integer> que=new LinkedList<>(Arrays.asList(12,32,12,33,45,87,90,123));
        System.out.println(que.peek());
//        System.out.println(que.peek());
        while(!que.isEmpty()){
            System.out.println(que.size()+"->"+que.poll()+"<-"+que.size());
        }


        List<Integer> lst5=Arrays.asList(21,43,55,65,110,2322);
        Stack<Integer> stk1=new Stack<>();
        List<Integer> answer=new ArrayList<>();
        System.out.println("Before: "+lst5);
        for(int val: lst5)
            stk1.push(val);
        while(!stk1.empty()){
            answer.add(stk1.pop());
        }
        System.out.println("after"+ answer);

        List<Integer> lst4=Arrays.asList(20,111,45,6,27,3,1,233);
        Stack<Integer> stk=new Stack<>();
        for(int val:lst4)
            stk.push(val);
        while(!stk.empty()){
            int val=stk.peek();
            System.out.println(val+"<-, size:-"+stk.size());
            stk.pop();
        }
        System.out.println("empty or not: "+stk.empty());

        String str="ertyuiuytrcvghmnbvfewertyujnbghjmnbhjmwertyuiojkbhvngbcfxdfsdaw";
        Map<Character,Integer> mp1=new LinkedHashMap<>();
        for(char val:str.toCharArray())
            mp1.put(val,mp1.getOrDefault(val,0)+1);
        System.out.println(mp1);

        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"anurag singh");
        mp.put(2,"rahul singh");
        mp.put(3,"sonu sharma");
        for(Map.Entry<Integer,String> val:mp.entrySet())
            System.out.println(val.getKey()+" - "+val.getValue());

        List<Integer> lst3=Arrays.asList(1,2,3);
        Set<Integer> st1=new LinkedHashSet<>(lst3);
        if(lst3.size()==st1.size())
            System.out.println("list elements does not containe any dublicates");
        else
            System.out.println("list containes dublicates");

        List<Integer> lst2=Arrays.asList(1,2,2,2,3,3,4,5,5,5);
        Set<Integer> st=new LinkedHashSet<>(lst2);
        System.out.println(st);

        List<Integer> lst1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int sum=0;
        for(int val:lst1)
            sum+=val;
        System.out.println(sum);
        System.out.println(
                lst1.stream().mapToInt(Integer::intValue).sum()
        );

        List<Integer> lst=new ArrayList<>(Arrays.asList(11,22,33,44,55,66));
        for(int val:lst)
            System.out.println(val);
    }
}
