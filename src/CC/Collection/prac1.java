package CC.Collection;

import java.util.*;

public class prac1 {

    public static boolean checkStringsEquals(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int totalVal=str1.length();
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char val:str1.toCharArray())
            hmap.put(val,hmap.getOrDefault(val,0)+1);

        for(Map.Entry<Character,Integer> entries: hmap.entrySet())
            totalVal-=entries.getValue();
        if(totalVal==0) {
            System.out.println("Strings are equal");
            return true;
        }
        else {
            System.out.println("Strings are not equal");
            return false;
        }


    }

    public static void missingNumber(List<Integer> lst){

        int ans=lst.get(0);
        for(int i=1;i<lst.size();i++)
            ans^=lst.get(i);
        for(int i=1;i<=lst.size()+1;i++)
            ans^=i;
        System.out.println(ans);

    }

    public static void reverseString(String str){
        Stack<Character> stk=new Stack<>();
        for(char val:str.toCharArray())
            stk.push(val);
        String answer="";
        while (!stk.empty()){
            answer+=stk.pop();
        }
        System.out.println(answer);
    }

    public static  void checkPalindrom(String str){
        String answer="";
        Stack<Character> stk=new Stack<>();
        for(char val:str.toCharArray())
            stk.push(val);
        while (!stk.empty())
            answer+=stk.pop();

        if(answer.equals(str))
            System.out.println(str + " string is palindrome");
        else
            System.out.println("string is not palinderome");
    }

    public static void stackSizeManually(Stack<Integer> stk){

        int size=0;
        while(!stk.empty()){
            stk.pop();
            size++;
        }
        System.out.println("Stack size:");
        System.out.println(size);

    }

    public static void reverseQueue(Queue<Integer> que){
        Stack<Integer> stk=new Stack<>();
        System.out.println("before: ");
        System.out.println(que);
        while (!que.isEmpty()){
            stk.push(que.poll());
        }
        while (!stk.empty())
            que.add(stk.pop());
        System.out.println("After: ");
        System.out.println(que);
    }

    public static Queue<Integer> onlyEven(Queue<Integer> que){
        Queue<Integer> ans=new LinkedList<>();
        while(!que.isEmpty()){
            if(que.peek()%2==0)
                ans.add(que.peek());
            que.poll();
        }
        return ans;

    }

    public static void main(String[] args) {

        //priority queue sorting
        System.out.println("priority queue:");
        PriorityQueue<Integer> pQueue=new PriorityQueue<>();// for max heap:- new PriorityQueue<>(Collections.reverseOrder()); or  new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<10;i++)
            pQueue.add(i%2==0?i+2:i-2);

        while (!pQueue.isEmpty()){
            System.out.println(pQueue.poll());
        }

        //only even from queue
        Queue<Integer> que2 =new LinkedList<>();
        for(int i=1;i<=5;i++)
            que2.add(i+1);
        que2 =onlyEven(que2);
        System.out.println("only evens: ");
        System.out.println(que2);

        //Reverse a Queue
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<5;i++)
            que.add(i+3);
        reverseQueue(que);

        //check the size of stack manually
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<5;i++)
            stk.push(i+23);
        stackSizeManually(stk);

        //palindrome of string
        checkPalindrom("madam");

        //priority queue to find the minium in list
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(12);
        pq.add(3);
        pq.add(99);
        pq.add(4);
        System.out.println("top element of priority queue:");
        System.out.println(pq.peek());

        //insert elements in queue and print them
        Queue<Integer> que1=new LinkedList<>();
        que1.add(12);
        que1.add(33);
        que1.add(322);
        while (!que1.isEmpty())
            System.out.println(que1.poll());

        //reverse the string using stack
        reverseString("hello");

        //Find first non-repeating character
        String nonRep="sdsdrjiss";
        Map<Character,Integer> nonFreq=new LinkedHashMap<>();
        for(char val:nonRep.toCharArray())
            nonFreq.put(val,nonFreq.getOrDefault(val,0)+1);
        char cAnswer='-';
        for(char val:nonRep.toCharArray())
            if(nonFreq.get(val)==1){
                cAnswer=val;
                break;
            }
        System.out.println("first non repeted character in string 'sdsdrjiss' :");
        System.out.println(cAnswer);


        //Count frequency using Map
        String str="aabbcccddeerrggff";
        Map<Character,Integer> mp=new LinkedHashMap<>();
        for(char ch: str.toCharArray())
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        System.out.println("Frequency of all characters in string: ");
        System.out.println(mp);

        //Remove duplicates using Set
        List<Integer> lst7=Arrays.asList(1,2,2,3,4,4);
        Set<Integer> set=new LinkedHashSet<>(lst7);
        System.out.println("removed dublicated from the list into set: ");
        System.out.println(set);

        //Remove All Occurrences of Element
        List<Integer> lst6=Arrays.asList(1,2,3,2,4,2);
        HashMap<Integer,Integer> countMap=new LinkedHashMap<>();
        for(int val:lst6)
            countMap.put(val,countMap.getOrDefault(val,0)+1);
        List<Integer> count=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entries:countMap.entrySet())
            if(entries.getValue()==1)
                count.add(entries.getKey());
        System.out.println(count);

        List<Integer> tempLst=new ArrayList<>(lst6);
        int toRemove=2;
        tempLst.removeIf(x->x==toRemove);
        System.out.println(tempLst);


        //Count Words in Sentence
        String words="java is java and java is easy";
        String wArr[] =words.split(" ");
        HashMap<String,Integer> wordFreq=new HashMap<>();
        for(String wrd: wArr)
            wordFreq.put(wrd,wordFreq.getOrDefault(wrd,0)+1);

        System.out.println(wordFreq);


        //Find Missing Number in List
        //Numbers from 1 to N, one missing
        List<Integer> lst4=Arrays.asList(1,2,3,4,6);
        Collections.sort(lst4);
        int answer=-1;
        for(int i=1;i<lst4.size();i++)
            if(lst4.get(i)-lst4.get(i-1)!=1){
                answer=lst4.get(i-1)+1;
                break;
            }
        System.out.println(answer);

        System.out.println("using XOR: ");
        missingNumber(lst4);

        //Check if Two Strings Are Anagrams
        //Same characters, different order
        String str1="listen";
        char str1c[]=str1.toCharArray();
        Arrays.sort(str1c);
        String string1=new String(str1c);

        String str2="silent";
        char str2c[]=str2.toCharArray();
        Arrays.sort(str2c);
        String string2=new String(str2c);

        if(string2.equals(string1))
            System.out.println("both strings are equal");
        else
            System.out.println("both strings are NOT equal");

        boolean tf = checkStringsEquals("listen","silent");


        //Find First Repeating Element
        List<Integer> lst2=Arrays.asList(1,2,3,4,2,5,1);
        List<Integer> containVal=new ArrayList<>();

        for(int val:lst2){
            if(!containVal.isEmpty() && containVal.contains(val)){
                System.out.println(val);
                break;
            }
            containVal.add(val);
        }

        //Given a list of integers, find the first element that appears only once
        List<Integer> lst1= Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);
        HashMap<Integer,Integer> hMap=new HashMap<>();

        for(int val: lst1)
            hMap.put(val,hMap.getOrDefault(val,0)+1);

        for(Map.Entry<Integer,Integer> entries:hMap.entrySet())
            System.out.println(entries.getKey()+": "+entries.getValue());

        for(int val:lst1)
            if(hMap.get(val)==1){
                System.out.println(hMap.get(val));
                break;
            }

    }
}
