package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testPushAndPop() {
        MyStack myStack = new MyStack();

        myStack.push(42);


        int poppedValue = (int) myStack.pop();

        assertEquals(42, poppedValue);
    }

    @Test
    public void testIsEmpty(){
        MyStack<Integer> emptyStack = new MyStack<>();
        assertTrue(emptyStack.isEmpty());

        MyStack<Integer> nonEmptyStack = new MyStack<>();
        nonEmptyStack.push(123);
        assertEquals(false,nonEmptyStack.isEmpty());
    }

    @Test
    public void testSize() {
        MyStack<String> stack = new MyStack<>();
        assertEquals(0, stack.size());

        stack.push("abc");
        assertEquals(1,stack.size());
    }
}
