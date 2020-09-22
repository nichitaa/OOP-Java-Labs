package com.company;

// PASECINIC NICHITA
// FAF-192

public class Main {

    public static void main(String[] args) {
        // task 1:
        BoxShape Object1 = new BoxShape(1, 2, 3); // 3 params
        BoxShape Object2 = new BoxShape(10);           // 1 param
        BoxShape Object3 = new BoxShape();                 // default value

        // task 2:
        Queue Queue1 = new Queue(3);
        Queue Queue2 = new Queue();
        Queue1.push(1);
        Queue1.push(2);
        Queue1.push(3);      // q1 = 1, 2, 3
        Queue1.pop();           // q1 = 2, 3    (FIFO)
        System.out.println("Queue1: "+ Queue1.showQueue());
        Queue2.push(4);
        Queue2.push(5);
        Queue2.push(6);      // q2 = 4, 5, 6
        Queue2.pop();           // q2 = 5, 6
        System.out.println("Queue2: "+ Queue2.showQueue() + "\n");

        // task 3:
        System.out.println("Object1 volume is: " + Object1.Volume());
        System.out.println("Object2 volume is: " + Object2.Volume());
        System.out.println("Object2 volume is: " + Object3.Volume() + "\n");

        System.out.println("Object1 surface area is: " + Object1.Surface());
        System.out.println("Object2 surface area is: " + Object2.Surface());
        System.out.println("Object3 surface area is: " + Object3.Surface() + "\n");

        Queue Queue3 = new Queue();     // empty queue (unlimited maxSize)
        Queue3.isEmpty();

        Queue Queue4 = new Queue(2); // full queue (with maxSize)
        Queue4.push(1);
        Queue4.push(2);
        Queue4.isFull();

        Queue3.push(0);               // queue with no maxSize
        Queue3.push(1);
        Queue3.push(2);
        Queue3.push(3);
        Queue3.isFull();

        Queue Queue5 = new Queue(4);  // queue with maxSize of 4
        Queue5.push(1);
        Queue5.push(2);
        Queue5.push(3);
        Queue5.isFull();                  // still have free space of 1 element


    }

}
