package CC.Collection;

import java.util.*;

public class Prac_string {

    //Write a function for string reverse and no. Of character, check for equals function with other string?
    // == and .equal() difference.

    public static void reverseString(String str){

        //1 approach
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
            rev+=str.charAt(i);
        System.out.println(rev);

        //2 approach
        String answer=new StringBuilder(str).reverse().toString();
        System.out.println(answer);

        //“we can reverse using loop, but StringBuilder is more efficient because
        // String is immutable.”

    }

    public static void  countCharacters(String str){

        HashMap<Character,Integer> chMap=new HashMap<>();
        for(char ch:str.toCharArray())
            chMap.put(ch,chMap.getOrDefault(ch,0)+1);
        System.out.println(chMap);
        System.out.println("total numbers of characters: "+chMap.size());

    }

    public static void stringAllYouNeed(){
        String s10 = new String("hello");
        String s20 = new String("hello");
        System.out.println(s10 == s20); // false
        String s11 = new String("hello");
        String s22 = new String("hello");
        System.out.println(s11.equals(s22)); // true

        /*
        * | Feature    | `==`             | `.equals()`       |
          | ---------- | ---------------- | ----------------- |
          | Comparison | Reference        | Content           |
          | Checks     | Memory address   | Value             |
          | Used for   | Objects identity | String comparison |

        * */

        String s21="hello";
        String s23="hello";
        System.out.println(s21==s23);//true
        System.out.println(s21.equals(s23));//true
//        Java uses String Pool
//        "hello" is stored only once in memory
//        Both variables point to same reference


        String str12="hello";
        String str13=new String("hello");
        System.out.println(str12==str13);//false
        System.out.println(str12.equals(str13));//true
//      "hello" → stored in String Pool
//      new String("hello") → creates new object in heap


        /*
        “In Java, == compares memory references, while .equals() compares actual content.
        When strings are created using literals, they are stored in the String Pool,
        so identical literals point to the same memory location.
        But when we use new String(), a new object is created in heap memory,
        so == returns false, even though .equals() returns true because content is same.”
        * */

        //In Java, String is immutable(Once a String object is created, its value cannot be changed).

        String str = "hello";
        str.concat(" world");
        System.out.println(str);//hello
        //Even after concat, original string is unchanged.Because:
        //str.concat(" world");
        //Creates a new String object
        //Does NOT modify existing one

        //correct way:
        str = str.concat(" world");
        System.out.println(str); // hello world

        //why immutable?
        //1.Security
        //Strings are used in:
        //Database URLs
        //File paths
        //Network connections
        //👉 If mutable, values could be changed → security risk
        //2. String Pool Optimization
        //Java stores strings in String Pool
        //Reuses same object
        //👉 Saves memory

        //String is immutable in Java, meaning its value cannot be changed once created.
        //This is done for security, performance through String Pool, thread safety, and efficient usage in hashing like in HashMap.

        //Mutable Alternatives
        //If they ask:
        //👉 “Then how do we modify strings?”
        //Use:
        //StringBuilder (not thread-safe, fast)
        //StringBuffer (thread-safe)
        //👉 StringBuilder
        //No synchronization
        //Faster
        //Used when only one thread is working

        //👉 StringBuffer
        //Methods are synchronized
        //Safe in multi-threading
        //Slightly slower
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");

        StringBuffer sbf = new StringBuffer("hello");
        sbf.append(" world");

        //Both give same output, but internally:
        //StringBuffer → uses synchronization
        //StringBuilder → does not

        //Why StringBuffer is Slower?
        //Because: Every method is synchronized

        //StringBuilder is not thread-safe and is faster because it does not use synchronization,
        // whereas StringBuffer is thread-safe because its methods are synchronized, which makes it slightly slower.
        // StringBuilder is preferred in single-threaded environments, while StringBuffer is used in multi-threaded scenarios.
    }

    public static void main(String[] args) {

        //Garbage Collector (GC)?:
        //In Java, Garbage Collector is a mechanism that automatically deletes unused objects from memory.
        //Garbage Collector is part of JVM that automatically removes unused objects from heap memory to free space and improve performance
        //Garbage Collection in Java is an automatic memory management process handled by JVM, where unused or unreachable objects
        // are removed from heap memory to free up space and improve performance.
        String strin = new String("hello");
        strin = null;
//        Object "hello" has no reference
//        GC will remove it from memory


        reverseString("anilKumar");
        countCharacters("anilKumarYadav");
        stringAllYouNeed();


        //Sort List of Strings by Length
        String str2[]={"apple","bat","cat","elephant","ox"};
        List<String> strList=Arrays.asList(str2);
        Collections.sort(strList,(a,b)->a.length()-b.length());
        System.out.println(strList);


        //Reverse a List (Using Collections)
        List<Integer> list9=Arrays.asList(1,2,3,4,5,6,7);
        Collections.reverse(list9);
        System.out.println(list9);

        //Find Common Elements Between Two Lists
        List<Integer> list7=Arrays.asList(1,2,3,4);
        List<Integer> list8=Arrays.asList(3,4,5,6,7);
        List<Integer> result=new ArrayList<>(list7);
        result.retainAll(list8);
        System.out.println("Common: "+result);


        //Merge Two Lists Without Duplicates
        List<Integer> list5=Arrays.asList(1,2,3);
        List<Integer> list6=Arrays.asList(3,4,5);

        Set<Integer> s1=new HashSet<>(list5);
        for(int i:list6)
            s1.add(i);//fine approch
        System.out.println(s1);
           //better approch:
        Set<Integer> s2=new HashSet<>(list5);
        s2.addAll(list6);// addAll() se sab add ho jaega, aur retainAll() se common aaega...
        System.out.println("Merge ele: "+s2);


        //Find Second Largest Element
        List<Integer> lst4=Arrays.asList(10,20,4,45,99);
        int temp=Integer.MIN_VALUE;
        for(int val:lst4)
            if(val>temp)
                temp=val;

        int answer=Integer.MIN_VALUE;
        for(int val:lst4)
            if(val>answer && val!=temp)
                answer=val;
        System.out.println(answer);

        //Convert List to Map (Index Mapping)
        List<Integer> lm=Arrays.asList(10,20,30);
        HashMap<Integer,Integer> idxMap=new HashMap<>();
        for(int i=0;i<lm.size();i++)
            idxMap.put(i, lm.get(i));
        for(Map.Entry<Integer,Integer> entries:idxMap.entrySet())
            System.out.println(entries.getKey()+"->"+entries.getValue());

        //Find Maximum Occurring Element
        List<Integer> lst3=Arrays.asList(1,2,2,3,3,3,3,3,3,3,4);
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int val:lst3)
            freqMap.put(val,freqMap.getOrDefault(val,0)+1);

        int answerVal=Integer.MIN_VALUE;
        int answerKey=-1;
        for(Map.Entry<Integer,Integer> entries:freqMap.entrySet())
            if(entries.getValue()>answerVal){
                answerKey=entries.getKey();
                answerVal=entries.getValue();
            }
        System.out.println(answerKey);

        //Count Even and Odd Numbers
        List<Integer> eoList=Arrays.asList(1,2,3,4,5,6);
        HashMap<String,Integer> eoMap=new HashMap<>();
        eoMap.put("Even",0);
        eoMap.put("Odd",0);
        for(int val:eoList){
            if(val%2==0)
                eoMap.put("Even",eoMap.get("Even")+1);
            else
                eoMap.put("Odd",eoMap.get("Odd")+1);
        }
        System.out.println("Even & odd:- ");
        System.out.println(eoMap);

        //Find Duplicate Elements in a List
        List<Integer> lst2=Arrays.asList(1,2,3,2,4,5,5,1);
        HashMap<Integer,Integer> freq=new LinkedHashMap<>();
        for(int val:lst2)
            freq.put(val,freq.getOrDefault(val,0)+1);

        List<Integer> Answer=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entries:freq.entrySet())
            if(freq.get(entries.getKey())>1) //if(entries.getValue() > 1)
                Answer.add(entries.getKey());

        System.out.println(Answer);

        //-------------------------------------------

        //Frequency of Elements (HashMap)
        List<Integer> lst= Arrays.asList(1, 2, 2, 3, 1, 4);
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int val:lst)
            hmap.put(val,hmap.getOrDefault(val,0)+1);
        System.out.println(hmap);

        //Remove Duplicates (Set)
        List<Integer> lst1=Arrays.asList(1, 2, 2, 3, 4, 4);
        Set<Integer> st=new HashSet<>();
        System.out.println("1st way: ");
        for(int val:lst1)
            st.add(val);
        System.out.println(st);

        System.out.println("2nd way:");
        Set<Integer> st1=new HashSet<>(lst1);
        System.out.println(st1);

        //Find First Non-Repeating Character
        String str="aabbcde";
        char cArr[]=str.toCharArray();
        HashMap<Character,Integer> hmap1=new HashMap<>();

        for(char val:cArr){
            hmap1.put(val,hmap1.getOrDefault(val,0)+1);
        }

        for(char val:cArr)
            if(hmap1.get(val)==1){
                System.out.println(val);
                break;
            }

        //Check Two Lists Are Equal (Ignore Order)
        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        List<Integer> list2=Arrays.asList(1,2,3,4,5);

        if(list1.equals(list2))
            System.out.println("both lists are equal");
        else
            System.out.println("lists are NOT equal");


    }
}
