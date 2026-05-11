package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1,4,3,2,4,5,6,3,2,1,3,5,4,6,7,9,8,7,6,2,5,7,6,5,4));
        List<Integer> res = new ArrayList<>();
        nums.stream()
                .distinct()
                .sorted()
                .forEach((x) -> {
                    System.out.print(x + " ");
                    res.add(x);
                });
        System.out.println();

        List<Integer> res1 = nums.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> res2 = nums.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(res1);

        Long cnt = nums.stream()
                .distinct()
                .sorted()
                .count();

        System.out.println(cnt);

        List<Integer> res3 = nums.stream().distinct().sorted().limit(3).toList();
        System.out.println(res3);

        // Filter, Map, Reduce

        List<Integer> res4 = nums.stream()
                .distinct()
                .sorted()
                .filter((x) -> {
                    return x%2==1;
                })
                .toList();

        System.out.println(res4);

        List<Integer> res5 = nums.stream()
                .distinct()
                .sorted()
                .filter((x) -> {
                    return x%2==1;
                })
                .map((x) -> {
                    return x*x;
                })
                .toList();
        System.out.println(res5);

        List<String> res6 = nums.stream()
                .distinct()
                .sorted()
                .filter((x) -> {
                    return x%2==1;
                })
                .map((x) -> {
                    if (x == 1) {
                        return "one";
                    } else if (x == 2) {
                        return "two";
                    } else if (x == 3) {
                        return "three";
                    } else {
                        return ("Unknown");
                    }
                })
                .toList();
        System.out.println(res6);

        // Performance benefit - Lazy evaluation and short-circuiting
        List<Integer> res7 = nums.stream()
                .distinct()
                .sorted()
                .filter((x) -> {
                    System.out.println("Filtering -> " + x);
                    return x%2==1;
                })
                .map((x) -> {
                    System.out.println("Mapping -> " + x);
                    return x*x;
                })
                .limit(2)
                .toList();
        System.out.println(res7);

        // Reduce (terminal operation)- aggregates elements of an array into a single value/collection
        int sum1 = 0;
        for(Integer num : nums){
            sum1 = sum1 + num;
        }
        System.out.println(sum1);
        // 1, 3, 5
        // Reduce for summation
        Integer sum2 = nums.stream()
                .reduce(0, (total , element) -> {
                    return total + element; //summation till now
                });
        System.out.println(sum2);

        // Reduce for findMax
        Integer maxVal = nums.stream()
                .limit(10)
                .distinct()
                .reduce(Integer.MIN_VALUE, (max, element) -> {
                    //max till now
                    return Math.max(max, element);
                });
        System.out.println(maxVal);

        // Factorial value of n using reduce


    }
}
