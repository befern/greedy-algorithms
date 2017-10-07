package com.greedyalgorithms.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public final class GreedyMath {

    private GreedyMath () {}

    public static int extractBiggerValueFromTotal(int total, int[] values ){
        Arrays.sort(values);

        for (int i=values.length; i>0; i--)
            while (total >= values[i-1]) return total - values[i-1];
        return total;
    }

    public static TreeMap<Double, Integer> itemsForDensityMap(int[] values, int[] weights){
        TreeMap<Double, Integer> amountsOfDensityValues = new TreeMap<Double, Integer>((Collections.reverseOrder()));

        for(int i=0; i< values.length; i++) {
            double itemDensity;

            if (weights[i] == 0) itemDensity = Integer.MAX_VALUE;
            else itemDensity = (double) values[i] / weights[i];

            if (amountsOfDensityValues.get(itemDensity) == null)
                amountsOfDensityValues.put(itemDensity, weights[i]);
            else
                amountsOfDensityValues.put(itemDensity, amountsOfDensityValues.get(itemDensity) + weights[i]);
        }

        return amountsOfDensityValues;
    }
}
