package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = new ArrayList<>(List.of(1, 2,5,8,6,1,9,4,2,3));
        ExecutorService es = Executors.newFixedThreadPool(10);
        Callable<List<Integer>> mergeSortTask = new MultiThreadedMergeSort(arrToSort, es);
        Future<List<Integer>> sortedArrFuture = es.submit(mergeSortTask);
        List<Integer> sortedArr = sortedArrFuture.get();
        System.out.println(sortedArr.toString());
    }
}
