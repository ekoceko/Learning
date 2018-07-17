package DataStructures.Tests;

import DataStructures.Types.BasicQueue;

public class QueueTest {
public static void main(String args[]){

    BasicQueue q2 = new BasicQueue(12);


    q2.enqueue(1);
    q2.access(0);
    q2.enqueue(2);
    q2.access(1);
    q2.enqueue(3);
    q2.access(2);
    q2.enqueue(4);
    q2.enqueue(5);
    q2.enqueue(6);
    q2.enqueue(7);
    q2.enqueue(8);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);
    q2.dequeue();
    q2.access(0);

}
}
