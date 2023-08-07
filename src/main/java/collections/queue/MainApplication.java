package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainApplication {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Order #1");
        queue.add("Order #2");
        queue.add("Order #3");
        queue.add("Order #4");
        queue.add("Order #5");

        for(int i=0; i <=4; i++){
            System.out.println(queue);
            System.out.println("Now Serving: " + (queue.peek()));
            queue.remove();
        }
    }
}
