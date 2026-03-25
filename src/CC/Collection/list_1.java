package CC.Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class list_1 {
    public static void main(String[] args) {
        //collection: simply an object that represents the group of a objects
        //collection frameworks: set of interfaces and classes that help in managing groups of objects

        //----------------------------LIST-------------------------------
        //list: ordered collection of elements aka sequence, control over where the elements are inserted and can contain DUBLICATE elements
        //list interface can be implemented by several classes -> ArrayList, LinkedList, vector and stack....
        // i.e, 1.) Order Preservation, 2.) index-based access, 3.) Allows dublicates
        //ArrayList->  Dynamically change the size



        //-----------------------ArrayList-------------------------
        List<Integer> lst=new ArrayList<>();
        ArrayList<Integer> aLst=new ArrayList<>();
        //Both create an ArrayList, but the difference is in the reference type (left side).
        /*List<Integer> lst = new ArrayList<>();
        Reference type = List (interface)
        Object type = ArrayList (implementation)*/
        //--
        /*ArrayList<Integer> aLst = new ArrayList<>();
        Reference type = ArrayList
        Object type = ArrayList*/
        //--
        /*Best Practice:
        List<Integer> lst = new ArrayList<>();
        Reason:
        More flexible
        More maintainable
        Follows OOP principle (Programming to interface)*/
        //-----
        /*When to use ArrayList directly?
                Use this only when you need ArrayList-specific methods, like:
        ensureCapacity()
        trimToSize()
        Simple Analogy
        Think of it like:
        List = Vehicle (general type)
        ArrayList = Car (specific type)
        Vehicle v = new Car();  // Flexible
        Car c = new Car();      // Less flexible*/

        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(11);
        list.add(45);
        list.add(77);
        System.out.println(list.get(4));//pass the index inside

        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");

        System.out.println(list.contains(23));// boolean return karta h

        for (int val:list)
            System.out.println(val);

        list.remove(2);// index pass karte hai.

        list.add(2,45);//add value at particular index
        list.set(2,100);// value replace/update ho jaega..
        System.out.println(list);
        // when we create an ArrayList, it has an internal capacity (default is 10), capacity refers to the size of the internal array
        //that can hold elements before needing to resize.
        //Growth factor: internal array full, new array is created with size 1.5 times to old array, all elements from the old array are copies
        // to the new array which is an O(n) operation

        ArrayList<Integer> demoList=new ArrayList<>(15);// ye h initial capacity iska matlab hai, itne size tak
        // resize karne ki koi zarurat nahi h....aur agar values initial capacity se zayada aa jae to size 1.5 se increase ho jaega as usually...
        System.out.println(demoList.size());//0 aage output me.
        // can we check the initial capacity?? no usually, but we can check that using reflection..

        List<String> list1= Arrays.asList("abc","pqrs","xyz"); // ab iss tarah se list baanane ki wagah se hum kuchh bhi na add kar sakte hai,
        // na hi kuchh remove kar sakte hai iss list1 me, size fix ho gaya hai, exception aa jaega agar hum add/remove karte hai to........kyuki iss list1 ka object different ho gaya hai normal list se(new ArrayList<>())
        // lakin replace/update kar sakte hai only..

        List<Integer> list2=List.of(1,2,3,4,5);// ye to ab modifiy bhi nahi hogi, ye unmodifiable list hai...of() se baanane se..

        String[] strArray={"abc","pqrs","xyz"};
        List<String> list3=Arrays.asList(strArray);
        // now, in order to make this list3 modifiable, or to make it like a normal list then we can do it following manner:
        List<String> list4=new ArrayList<>(list3);
        list4.add("stu");
        System.out.println(list4); // now this will work fine...

        List<Integer> list5=new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        List<Integer> list6=List.of(4,5,6);
        list5.addAll(list6);
        System.out.println(list5);//[1, 2, 3, 4, 5, 6]

        //we can even remove the elements from the list using value...
        List<String> strList=new ArrayList<>();
        strList.add("abc");
        strList.add("pqr");
        strList.add("xyz");
        strList.add("lmn");

        strList.remove("xyz");//humne value pass kiya hai, to jo bhi value ka first occurance hoga wo remove ho jaega,
        // behind the scean object pass hota hai jab hum value pass karte hai remove method me..
        System.out.println(strList);


        List<Integer> numList=new ArrayList<>();
        numList.add(11);
        numList.add(22);
        numList.add(33);

        //numList.remove(11);//-->this is index, this will give us exception, so we need to convert this into its wrapper class....
        numList.remove(Integer.valueOf(11));// now this will remove 11 from the numList
        System.out.println(numList);


        // Converting to array
        List<Integer> numbersList=new ArrayList<>();
        numbersList.add(22);
        numbersList.add(11);
        numbersList.add(33);
        Object[] array=numbersList.toArray();
        Integer[] array1=numbersList.toArray(new Integer[0]);//ab ye 0 size ka array ban jaega..numbersList ek Integer type ka tha to "new Integer[0]" likha , string hota to string likhate...
        System.out.println(array1[1]);//->22

        // to sort the values inside the list
        Collections.sort(numbersList);
        System.out.println(numbersList);

        numbersList.add(10);
        numbersList.sort(null);//iske aandar comparator pass hoga, null pass karne se natural order(ascending order) me chizee sort ho jaegi....but for custom comparizion ke liye hum ek class baana sakte hai that implements Comparator<datatype> interface and complete the compare method..
        System.out.println(numbersList); // this will also sorts the values..

        List<String> words=Arrays.asList("abd","dkas","popwp","we","a","nameofsort");
        words.sort((a,b)->a.length()-b.length());//yaha sort ke aandar humne custom Comparator lika hai, custom Comparator ke liye hum class bhi baana sakte the jisse hume implement karna hota Comparator<datatype> interface se, phir "compare" method ko complete karna hota,
        // wo compare method 2 argument leta hai jo dono argument ke difference se ye decide karta hai values ko kaise sort karna hai ascending me ya dscending me, based in +ve ya -ve value, wahi same chize humne lamda function ki help se directly sort method ke parameter me hi likh diya....
        System.out.println(words);// work fine as expected.
        //more on comparator and custom comparator to know........




        //------------------------LinkedList-----------------------
        //linked list stores its elements as node in a doubly linked list, this different performance characteristics and use scenarios compare to ArrayList.

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.addFirst(10);
        linkedList.addLast(44);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        linkedList.removeIf(x->x%2==0);// iske aandar predicate pass karte hai
        System.out.println(linkedList);// saare even delete ho jaega

        LinkedList<String> animal=new LinkedList<>(Arrays.asList("cat","dog","elephant"));
        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("dog","lion"));
        animal.removeAll(animalToRemove);// common wale remove ho jaega..
        System.out.println(animal);



        //--------------------vector--------------------------
        // introducted in jdk1.0 before collection framework and is synchronized, making it thread safe, now it is part of collection framework
        // However, due to its synchronization overhead, it's generally recommended to use other modern alternatives like ArrayList in single-threaded scenaríos. Despite this,
        // Vector is still useful in certain situations, particularly in multi- threaded environments where thread safety is a concern.

        Vector<Integer> vector=new Vector<>();
        //  Vector(): Creates a vector with an initial capacity of 10.
        // Vector(int initialCapacity): Creates a vector with a specified initial capacity.
        // Vector(int initialCapacity, int capacityIncrement): Creates a vector with an initial
        // capacity and capacity increment (how much the vector should grow when its capacity is exceeded).
        // Vector(Collection<? extends E> c): Creates a vector containing the elements of the specified collection.

        //vector ke aandar capacity bhi check kar sakte hai unlike arraylist
        System.out.println(vector.capacity()); // initially capacity 10 ki hoti hai same as arraylist...

        Vector<Integer> vec1=new Vector<>(5); //ye hai initial capacity ko define karna, inte size tak koi incremant nahi hoga, lakin capacity puri hone par capacity twice to jaega unlike arraylist jaha 1.5 time hota tha..
        // vector me hum capacity pura hone ke baad kitna increment hoga wo bhi set kar sakte hai.....like below
        Vector<Integer> vec2=new Vector<>(5,3); // jab capacity pura hoga to capacity +3 se increment ho jaega...

        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.add(23);
        linkedList1.add(45);
        linkedList1.add(67);
        Vector<Integer> vector1=new Vector<>(linkedList1);
        System.out.println(vector1);
        /*
         add(E e): Adds an element at the end.
        add(int index, E element): Inserts an element at the specified index.
        get(int index): Retrieves the element at the specified index.
        set(int index, E element): Replaces the element at the specified index.
        remove (Object o): Removes the first occurrence of the specified element.
        remove(int index): Removes the element at the specified index.
        size(): Returns the number of elements in the vector.
        isEmpty(): Checks if the vector is empty.
        contains(Object o): Checks if the vector contains the specified element.
        clear(): Removes all elements from the vector.
        * */

        /*Since Vector methods are synchronized, it ensures that only one thread can access the vector at a time.
                This makes it thread-safe but can introduce performance overhead in single-threaded environments
                because synchronization adds locking and unlocking costs.

        In modern Java applications, ArrayList is generally preferred over Vector when synchronization isn't required.
        For thread-safe collections, the CopyOnWriteArrayList or ConcurrentHashMap from the java.util.concurrent package is often recommended
        instead.*/




        //-----------------------Stack--------------------------
       //Since Stack extends Vector, it is synchronized, making it thread-safe
       //LIFO Structure: Stack follows the Last-In-First-Out (LIFO) principle, where the last element added is the first one to be removed.
        //Inheritance: Stack is a subclass of Vector, which means it inherits all the features of a dynamic array but is constrained by the stack's LIFO nature.

        Stack<Integer> stack=new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        System.out.println(stack);
        Integer removedEle=stack.pop();
        System.out.println(stack);
        Integer seeTopElement=stack.peek();

        //---------------------------CopyOnWriteArrayList---------------------

        // "Copy on Write" means that whenever a write operation
// like adding or removing an element
// instead of directly modifying the existing list
// a new copy of the list is created, and the modification is applied to that copy
// This ensures that other threads reading the list while it's being modified are unaffected

// Read Operations: Fast and direct, since they happen on a stable list without interference from
// Write Operations: A new copy of the list is created for every modification.
// The reference to the list is then updated so that subsequent reads use this new list
// use this when read intensive kaam ho...

        CopyOnWriteArrayList<Integer> list7=new CopyOnWriteArrayList<>();


    }
}
