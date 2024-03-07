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
}
