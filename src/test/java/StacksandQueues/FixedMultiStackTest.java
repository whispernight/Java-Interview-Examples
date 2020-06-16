package StacksandQueues;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class FixedMultiStackTest {
    @Test(expected = FullStackException.class)
    public void stackThrowsExceptionWhenPushFull() throws FullStackException {
        System.out.println("stackThrowsExceptionWhenPushFull");
        FixedMultiStack stack = new FixedMultiStack(1);
        stack.push(1, 1);
        stack.push(1, 1);
    }
    @Test
    public void stackIsNotEmpty() throws FullStackException {
        System.out.println("stackIsNotEmpty");
        FixedMultiStack stack = new FixedMultiStack(1);
        stack.push(1, 1);
        assertFalse(stack.isEmpty(1));
    }
    @Test
    public void stackIsEmpty() throws FullStackException {
        System.out.println("stackIsEmpty");
        FixedMultiStack stack = new FixedMultiStack(1);
        assertTrue(stack.isEmpty(1));
    }
    @Test
    public void allStacksAreEmpty() throws FullStackException {
        System.out.println("allStacksAreEmpty");
        FixedMultiStack stack = new FixedMultiStack(1);
        assertTrue(stack.isEmpty(0) && stack.isEmpty(1) && stack.isEmpty(2));
    }
    @Test(expected = EmptyStackException.class)
    public void stackThrowsExceptionWhenPopEmpty() {
        System.out.println("stackThrowsExceptionWhenPopEmpty");
        FixedMultiStack stack = new FixedMultiStack(1);
        stack.pop(1);
    }
}