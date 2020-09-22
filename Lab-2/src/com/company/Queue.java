package com.company;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> arr; // without maxSize
    public int maxSize;
    public int c; // size of the current queue

    // construct queue with masSize
    public Queue(int m) {
        arr = new ArrayList<>();
        maxSize = m;
        c = 0;
    }

    // default constructor
    public Queue() {
        arr = new ArrayList<>();
        c = 0;
        maxSize = 0;
    }

    // add element to queue
    public void push(int n) {
        if (this.maxSize > this.c || this.maxSize == 0) {
            arr.add(n);
            c += 1;
        } else {
            System.out.println("The queue is full!");
        }
    }

    // remove from queue
    public void pop() {
        if (this.c == 0) {
            System.out.println("Underflow!");
        } else {
            arr.remove(0);
            c -= 1 ;
        }
    }

    // is empty?
    public void isEmpty() {
        if (c==0){
            System.out.println("The queue is empty!");
        }
    }

    // is full?
    public void isFull() {
        if ( maxSize==0 ) {
            System.out.println("The queue can never be full!");
        } else if ( c==maxSize ) {
            System.out.println("The queue is full!");
        } else {
            System.out.println("Free space available: " + (maxSize-c));
        }
    }

    public ArrayList<Integer> showQueue() {
        return arr;
    }
}
