package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        //    Collection
        // List, Queue, Set


        //List
        // Ordered collection
        // Random access through index
        // Allows duplicate

        // Lists can be implemented by 4 things
        // Array, LinkedList, Vector, Stack

        //ArrayList
        //Insertion at end TC - O(1) (Amortized constant time) | start/middle - O(n)
        //Random access TC - O(1)
        List<Integer> list1 = new ArrayList<>();

        //Insertion at start/end TC - O(1) | middle - O(n)
        //Random access TC - O(n)
        List<Integer> list2 = new LinkedList<>();

        //Thread safe -old java implementation of arraylist, growth is your control -> deprecated
        List<Integer> vector1 = new Vector<>();
        // Thread safe, works LIFO and extends vector
        List<Integer> stack1 = new Stack<>();


        // Queue
        // Priority Queue is the implementation of min-heap
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(10);
        pq.add(9);
        pq.add(2);
        pq.add(15);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        // Array implementation of Deque (extends Queue)
        Deque<Integer> aq = new ArrayDeque<>();

        //LinkedList implementation of Deque
        Deque<Integer> lq = new LinkedList<>();

        //Sets [No duplicates allowed, Ordered or Unordered] - HashSet, LinkedHashSet, TreeSet

        // HashSet - Implemented using HashMap
        // Unordered: These are unordered or random ordered
        Set<Integer> hset = new HashSet<>();
        hset.add(12);
        hset.add(32);
        hset.add(21);
        hset.add(47);
        hset.add(36);
        hset.add(5);
        System.out.println(hset);

        // LinkedHashSet - Implement using linkedList+hashMap
        // Ordered:This follows insertion order
        Set<Integer> lset = new LinkedHashSet<>();
        lset.add(12);
        lset.add(32);
        lset.add(21);
        lset.add(47);
        lset.add(36);
        lset.add(5);
        System.out.println(lset);

        // TreeSet - Reb-Black-trees and HashMap
        // Ordered: Natural ordering
        Set<Integer> tset = new TreeSet<>(Collections.reverseOrder());
        tset.add(12);
        tset.add(32);
        tset.add(21);
        tset.add(47);
        tset.add(36);
        tset.add(5);
        System.out.println(tset);

        // MAPS
        // Random ordered
        Map<String, Integer> map1 = new HashMap<>();
        // Ordered - Insertion order
        // LinkedList + HashMap
        Map<String, Integer> map2 = new LinkedHashMap<>();
        // Ordered - Natural order - Reverse using comparator/comparable
        // BinaryTree - RBT
        Map<String, Integer>  map3 = new TreeMap<>();

        // SMALL HOMEWORK: Add elements to all above hashmaps see the ordering of key value pairs based on keys

    }
}
