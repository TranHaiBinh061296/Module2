package oop.stop_watch;

import java.time.LocalTime;
import java.util.Random;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.printf("Start: %d\n", watch.getStarTime());
        watch.end();
        System.out.printf("End: %d\n", watch.getEndTime());
        System.out.printf("Elased Time %d\n", watch.getElapsedTime());
    }
    private long starTime;
    private long endTime;

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        long elapsed = starTime - endTime;
        return elapsed;
    }
    public int [] randomArray() {
        int [] array = new int[100000];
        for (int i =0; i < 100000; i++) {
            array[i] = (new Random()).nextInt(100000)+1;
        }
        return array;
    }
    public void selectionSort(int [] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int min_idx = i;
            for (int j = 1; j <arr.length; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public void start() {
        this.starTime = System.currentTimeMillis();
    }
    public void end() {
        this.endTime = System.currentTimeMillis();
    }
}
