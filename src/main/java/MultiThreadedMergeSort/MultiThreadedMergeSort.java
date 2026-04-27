package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadedMergeSort implements Callable<List<Integer>> {
    List<Integer> arrToSort;
    ExecutorService es;

    public MultiThreadedMergeSort(List<Integer> arrToSort, ExecutorService es) {
        this.arrToSort = arrToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Base condition
        if(arrToSort.size() == 1){
            return arrToSort;
        }
        int size =  arrToSort.size();
        int mid = size/2;

        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArrayToSort.add(arrToSort.get(i)); // arr[i]
        }

        for(int i=mid;i<size;i++){
            rightArrayToSort.add(arrToSort.get(i));
        }

//        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<List<Integer>> leftSortedArrFuture = es.submit(new MultiThreadedMergeSort(leftArrayToSort, es)); // 0.00x ms to start the left sort task
        Future<List<Integer>> rightSortedArrFuture = es.submit(new MultiThreadedMergeSort(rightArrayToSort, es)); // 0.00x ms to start the right sort task

        List<Integer> leftSortedArr = leftSortedArrFuture.get(); // wait for 25 secs
        List<Integer> rightSortedArr = rightSortedArrFuture.get(); // 3mins-25secs

        return merge(leftSortedArr, rightSortedArr);
    }

    public List<Integer> merge(List<Integer> sortedLeftArray, List<Integer> sortedRightArray){
        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}

// List<Int> res = call();