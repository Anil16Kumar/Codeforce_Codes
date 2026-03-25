package CC.Collection;

import java.util.*;

public class map_2 {
    public static void main(String[] args) {

        //---------------------------MAP----------------------
        //Extends nahi karta hai collection ko...ye ek saprate interface hai ye...
        // Keys and values
        //cannot contains the duplicate keys, each key can map to at most one value
        // like a DICTIONARY

        //Key-Value Pairs: Each entry in a Map consists of a key and a value.
        //Unique Keys: No two entries can have the same key.
        //One Value per Key: Each key maps to a single value.
        //Order: Some implementations maintain insertion order (LinkedHashMap), natural order (TreeMap), or no order (HashMap).


        //-----------------HashMap----------------------
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"abcd");
        map.put(2,"pqrs");
        map.put(3,"xyz");
        System.out.println(map.get(2));
        System.out.println(map.get(344));//null
        System.out.println(map.containsKey(3));//true
        System.out.println(map.containsValue("abcd"));//true

        Set<Integer> intList=map.keySet();//set same hai list ki tarah hi, bass isme duplicate store nahi hota....aur humare key hamesha unique hi hota hai
        for (int i: intList)
            System.out.println(i);

        for(int i: map.keySet())
            System.out.println(i);// this will also work as last one..

        for (int i:map.keySet())
            System.out.println(map.get(i));

        Set<Map.Entry<Integer,String>> entries =map.entrySet();
        for(Map.Entry<Integer,String> entry:entries)
            System.out.println(entry.getKey() + ": "+entry.getValue());

        for(Map.Entry<Integer,String> entry:entries)
            System.out.println(entry.getValue().toUpperCase());
        map.put(2,"okij");//agar key already exist kar raha hoga to iss value se replace ho jaega

        //Unordered: Does not maintain any order of its elements. Allows null Keys and Values: Can have one null key and multiple null
        //values.
        // Not Synchronized: Not thread-safe; requires external synchronization if used in a multi-threaded context.
        //Performance: Offers constant-time performance (O(1)) for basic operations like get and put, assuming the hash function disperses
        //elements properly.


        boolean isremove = map.remove(1, "232");
        System.out.println(isremove);// false aaega kyuki wo value hi nahi hai map me..

        //  INTERNAL STRUCTURE OF HASHMAP

        //Basic components of hashmap:
        //1. key -> the identifier used to retrieve the value
        //2. value -> data associated with the key
        //3. Bucket -> place where key-value pairs are stored, think it as a cells in a list(array)..
        //4. hash function -> convert key into index(bucket location) for storage

        //A hash function is an algorithm that takes an input (or "key") and returns a fixed-size string of bytes,
        // typically a numerical value. The output is known as a hash code, hash value, or simply hash. The primary purpose of a hash
        //function is to map data of arbitrary size to data of fixed size

        //Deterministic: The same input will always produce the same output.
        //Fixed Output Size: Regardless of the input size, the hash code has a consistent size (e.g., 32-bit, 64-bit).
        //Efficient Computation: The hash function should compute the hash quickly.

        //Step 1: Hashing the Key
        //First, the key is passed through a hash function to generate a unique hash code (an integer number). This hash code
        //helps determine where the key-value pair will be stored in the array (called a "bucket array").

        //Step 2: Calculating the Index
        //The hash code is then used to calculate an index in the array (bucket location) using
        //int index = hashCode % arraySize;
        //The index decides which bucket will hold this key-value pair.
        //For example, if the array size is 16, the key's hash code will be divided by 16, and the remainder will be the index.

        //Step 3: Storing in the Bucket
        //The key-value pair is stored in the bucket at the calculated index. Each bucket can hold multiple key-value pairs
        //(this is called a collision handling mechanism, discussed later).

        //map.put("apple", 50);
        //"apple" is the key.
        //• 50 is the value.
        //• The hash code of "apple" is calculated.
        //• The index is found using the hash code.
        //• The pair ("apple", 50) is stored in the
        //corresponding bucket.

        //How HashMap Retrieves Data
        //When we call get(key), the HashMap follows these steps:
        //Hashing the Key: Similar to insertion, the key is hashed using the same hash function to calculate its hash code.
        //Finding the Index: The hash code is used to find the index of the bucket where the key-value pair is stored.
        //Searching in the Bucket: Once the correct bucket is found, it checks for the key in that bucket. If it finds the key, it returns the associated value.

        //Handling Collisions
        //Since different keys can generate the same index (called a collision), HashMap uses a technique to handle this situation. Java's HashMap
        //uses Linked Lists (or balanced trees(red-black tree) after Java 8) for this.
        //If multiple key-value pairs map to the same bucket, they are stored in a linked list inside the bucket.
        //When a key-value pair is retrieved, the HashMap traverses the linked list, checking each key until it finds a match.

        //HashMap Resizing (Rehashing)
        //HashMap has an internal array size, which by default is 16.
        //When the number of elements (key-value pairs) grows and
        //exceeds a certain load factor (default is 0.75), HashMap
        //automatically resizes the array to hold more data. This process is
        //called rehashing.
        //The default size of the array is 16, so when more than 12 elements (16 * 0.75) are inserted, the HashMap will resize.

        //During rehashing
        //The array size is doubled.
        //1. All existing entries are rehashed (i.e., their positions are recalculated)
        //and placed into the new array.
        //2. This ensures the HashMap continues to perform efficiently even as
        //more data is added.

        //Time Complexity
        //HashMap provides constant time 0(1) performance for basic
        //operations like put() and get() (assuming no collisions).
        //However, if there are many collisions, and many entries are
        //stored in the same bucket, the performance can degrade to O(n),
        //where n is the number of elements in that bucket.
        //But after Java 8, if there are too many elements in a bucket,
        //HashMap switches to a balanced tree instead of a linked list to
        //ensure better performance O(log n).


        //----------Linked HashMap----------------

        LinkedHashMap<String,Integer> lhmap=new LinkedHashMap<>();
        //ye hum tab use karte hai jab order matter karta hai, hum jiss order me values to insert karege usi order me values rahegi..
        //double linked list, along with array like HashMap

        lhmap.put("dasd",1);
        lhmap.put("aerqwq",4);
        lhmap.put("wssws",6);
        for(Map.Entry<String, Integer> entry:lhmap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        LinkedHashMap<String,Integer> lmap=new LinkedHashMap<>(10,0.3f,true);
        lmap.put("asda",1);
        lmap.put("qweq",2);
        lmap.put("gfgf",3);
        // yaha par humne accessOrder true set kar diya hai, iske chalte hum jab bhi lmap me rakhe data ko access karege to wo last me chal jaega

        lmap.get("gweg");//-> ab ye lat me chal jaega  ["asda","gfgf", "gweg"]
        lmap.get("gfgf");// -> ["asda", "gweg" "gfgf"], ye isliye ho paya kyuki humne accessOrder true set kar diya...
        // least recently used ka track rakhane me kaam aata hai.....for example, jo chiz hum use nahi kar rahe ya bahut kaam use kar rahe hai wo uper aa jaega...
        for(Map.Entry<String,Integer> lmp:lmap.entrySet())
            System.out.println(lmp.getKey()+": "+lmp.getValue());

        HashMap<String,Integer> hashMap=new HashMap<>();
        LinkedHashMap linkedHashMap=new LinkedHashMap(hashMap);

        hashMap.put("atul",12);
        hashMap.put("anurag",33);
        hashMap.put("rahul",32);

        //--------HashMap vs IdentityHashMap-----------
        String key1 = new String( "key");
        String key2 = new String( "key");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put(key1, 1);
        map1.put(key2, 2);
        System.out.println(map1);// yaha value replace ho jaega
        Map<String, Integer> map2 = new IdentityHashMap<>();
        map2.put(key1, 1);
        map2.put(key2, 2);
        System.out.println(map2);// ab yaha pe dono values print hogi
        //HashMap uses equals() for comparison, while IdentityHashMap uses reference equality (==),
        //so it treats objects with same content as different if they are different instances.

        //------Comparable ----
        List<Student> lst=new ArrayList<>();
        lst.add(new Student("anil",6.7));
        lst.add(new Student("rahul",7.2));
        lst.add(new Student("shami",8.7));
        lst.add(new Student("znurag",8.7));

        lst.sort(null);
        System.out.println(lst);






    }
}
