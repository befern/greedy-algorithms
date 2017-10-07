package com.greedyalgorithms.app;

import junit.framework.TestCase;

public class GreedyMathTest extends TestCase{

    public void testDotProductAllPositives(){
        assertEquals(897,GreedyMath.maxDotProduct(new int[]{23}, new int[]{39}));
    }

    public void testDotProductWithNegatives(){
        assertEquals(23,GreedyMath.maxDotProduct(new int[]{1, 3, -5}, new int[]{-2, 4, 1}));
    }

    public void testMaxArrayDotProduct(){
        assertEquals(0,GreedyMath.maxDotProduct(new int[1000], new int[1000]));
    }
}
