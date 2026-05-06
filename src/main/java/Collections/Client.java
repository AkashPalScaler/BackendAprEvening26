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

        // LinkedHashSet - Implement using linkedList+hashMap
        // TreeSet - Reb-Black-trees and HashMap

    }
}
