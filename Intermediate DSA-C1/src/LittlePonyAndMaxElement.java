//https://www.scaler.com/test/c2f0d2ef6b/#/problem_1

import java.util.Collections;
import java.util.PriorityQueue;

public class LittlePonyAndMaxElement {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> maxHeap = createMaxHeap(A);

        return getNumberOfElementsTobeRemoved(maxHeap, B);
    }

    private PriorityQueue<Integer> createMaxHeap(int[] A){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : A){
            maxHeap.add(i);
        }
        return maxHeap;
    }

    private int getNumberOfElementsTobeRemoved(PriorityQueue<Integer> maxHeap, int B){

        int count = 0;

        while (!maxHeap.isEmpty()){
            int currentElement = maxHeap.poll();
            if(currentElement == B){
                return count;
            }
            else if(currentElement > B){
                count++;
            }
            else{
                break;
            }
        }

        return -1;
    }

}
