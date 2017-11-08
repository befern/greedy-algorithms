package com.greedyalgorithms.app;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class GreedyMathTest extends TestCase{
    List<Integer> resultSummands;

    public void testDotProductAllPositives(){
        assertEquals(897,GreedyMath.maxDotProduct(new int[]{23}, new int[]{39}));
    }

    public void testDotProductWithNegatives(){
        assertEquals(23,GreedyMath.maxDotProduct(new int[]{1, 3, -5}, new int[]{-2, 4, 1}));
    }

    public void testMaxArrayDotProduct(){
        assertEquals(0,GreedyMath.maxDotProduct(new int[1000], new int[1000]));
    }

    public void testMaximizeDifferentSummandsBasic (){
        resultSummands = Arrays.asList(1,2,3);
        assertEquals(resultSummands, GreedyMath.maximizeDifferentSummands(6));
    }

    public void testMaximizeDifferentSummandsAddEnd (){
        resultSummands = Arrays.asList(1,2,5);
        assertEquals(resultSummands, GreedyMath.maximizeDifferentSummands(8));
    }

    public void testMaximizeDifferentSummandsSingleResult (){
        resultSummands = Arrays.asList(2);
        assertEquals(resultSummands, GreedyMath.maximizeDifferentSummands(2));
    }
}
