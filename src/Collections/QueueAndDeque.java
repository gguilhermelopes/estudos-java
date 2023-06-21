package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAndDeque {

    public void queueAndDequeExample(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("short");
        queue.add("medium");
        queue.add("very long");

        while (queue.size() != 0){
            System.out.println(queue.remove());
        }

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Green");
        deque.add("Orange");
        deque.add("Blue");

        System.out.println(deque);
    }


}
