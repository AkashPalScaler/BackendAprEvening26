package Generics;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, Integer> point = new Pair<>(10,20);
        Integer x = point.getFirst();
        point.setSecond(20);

        Pair<String, Integer> populationPair = new Pair<>("Mumbai", 213);

        Pair pair = new Pair(); // Backward compatability
        Pair<Object, Object> pair1 = new Pair<>();
        pair.setFirst("Akash");
        pair.setFirst(12);
//        pair.setFirst(7.0f);

        String name = (String)pair.getFirst();
        Integer y = (Integer) pair.getSecond();


    }
}

//Collection -> List, queue, set
//List -> ArrayList, LinkedList, Vector -> Stack
