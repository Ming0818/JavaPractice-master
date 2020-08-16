package othercode;

import java.util.PriorityQueue;

public class JavaTest02 {

    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int[] arr = {5,2,6,1,2,9,0};
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(heap.poll());
        }
    }
}
