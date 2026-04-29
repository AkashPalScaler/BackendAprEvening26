package MultithreadedSum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = new ArrayList<>(List.of(1,4,2,5,6,3,5,67,6,43,3,34,42,2,3,3,2,2,23,3,3,2,1,4,2,5,6,3,5,67,6,43,3,34,42,2,3,3,2,2,23,3,3,2,1,4,2,5,6,3,5,67,6,43,3,34,42,2,3,3,2,2,23,3,3,2,1,4,2,5,6,3,5,67,6,43,3,34,42,2,3,3,2,2,23,3,3,2,1,4,2,5,6,3,5,67,6,43,3,34,42,2,3,3,2,2,23,3,3,2));
        Integer cores = Runtime.getRuntime().availableProcessors();
        Integer chunkSize = arr.size()/cores;

        ExecutorService es = Executors.newFixedThreadPool(cores);

        List<Future<Long>> futures = new ArrayList<>();
        for(int i=0;i<cores;i++){
            futures.add(es.submit(new SumAnArray(arr, i*chunkSize, (i+1)*chunkSize)));
        }
        Long sum=0L;
        for(Future<Long> future : futures){
            sum+=future.get();
        }

        System.out.println("Total sum : " + sum);

        // 1 2 3 4 5 6 7 8 - 2 cores, chunksize=4
        // 1st: (arr, 0, 4), 2nd: (arr, 4, 8)
    }
}
