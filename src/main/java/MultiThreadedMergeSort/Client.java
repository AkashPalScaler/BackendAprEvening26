package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = new ArrayList<>(List.of(1, 2,5,8,6,1,9,4,2,3));
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<List<Integer>> sortedArrFuture = es.submit(new MultiThreadedMergeSort(arrToSort, es));
        List<Integer> sortedArr = sortedArrFuture.get();
        System.out.println(sortedArr.toString());
    }
}
