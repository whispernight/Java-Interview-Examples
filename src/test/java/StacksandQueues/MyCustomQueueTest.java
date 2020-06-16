package StacksandQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCustomQueueTest {

    @Test
    public void size() {
        MyCustomQueue mcq = new MyCustomQueue();
        assertEquals(0, mcq.size());
    }

    @Test
    public void add() {
        MyCustomQueue mcq = new MyCustomQueue();
        mcq.add(99);
        assertEquals(1, mcq.size());
    }

    @Test
    public void peek() {
        MyCustomQueue mcq = new MyCustomQueue();
        mcq.add(99);
        assertEquals(99, mcq.peek());
    }

    @Test
    public void remove() {
        MyCustomQueue mcq = new MyCustomQueue();
        mcq.add(99);
        mcq.remove();
        assertEquals(0, mcq.size());
    }
}