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
        assertEquals(1, myStack.size());

        int poppedValue = (int) myStack.pop();
        assertEquals(0, myStack.size());
        assertEquals(42, poppedValue);
    }
}
