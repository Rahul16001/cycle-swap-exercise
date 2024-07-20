package com.epam.rd.autotasks;

import java.util.ArrayDeque;
import java.util.Queue;

class CycleSwap {

    static void cycleSwapCommon(int []array, int shift)
    {
        Queue<Integer> back = new ArrayDeque<>();
        Queue<Integer> front = new ArrayDeque<>();
        int index = array.length - shift;

        for(int i=0; i < array.length;i++)
        {
            if(i < index) front.offer(array[i]);
            else back.offer(array[i]);
        }

        int counter = 0;

        while(!back.isEmpty())
        {
            array[counter] = back.poll();
            counter++;
        }
        while(!front.isEmpty())
        {
            array[counter] = front.poll();
            counter++;
        }
    }
    static void cycleSwap(int[] array) {

        cycleSwapCommon(array , 1);

    }

    static void cycleSwap(int[] array, int shift) {
        cycleSwapCommon(array,shift);
    }
}
