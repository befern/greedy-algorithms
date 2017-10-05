package com.greedyalgorithms.app;

import java.util.Arrays;

public final class GreedyMath {

    private GreedyMath () {}

    public static int extractBiggerValueFromTotal(int total, int[] values ){
        Arrays.sort(values);

        for (int i=values.length; i>0; i--)
            while (total >= values[i-1]) return total - values[i-1];
        return total;
    }

}
