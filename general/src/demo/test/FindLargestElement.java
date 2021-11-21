package demo.test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class FindLargestElement {

    public static void main(String[] a)
    {
        int[] ar = new int[]{1,5,7,9};

        findKLargestElement(ar, 2);

    }

    private static void findKLargestElement(int[] ar, int k) {

        PriorityQueue<Integer> priorityQueue= new PriorityQueue();

        for(int i=0; i<k; i++)
        {
            priorityQueue.add(ar[i]);
        }

        for(int h=k;h<ar.length;h++)
        {
            if(priorityQueue.peek() > ar[h])
                continue;
            else{
                priorityQueue.poll();
                priorityQueue.add(ar[h]);
            }
        }
        Iterator iterator = priorityQueue.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
    }
}
