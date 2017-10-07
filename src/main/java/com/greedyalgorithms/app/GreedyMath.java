package com.greedyalgorithms.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public final class GreedyMath {

    private GreedyMath () {}

    public static int extractBiggestValue(int balance, int[] subtractors){
        Arrays.sort(subtractors);

        for (int i=subtractors.length; i>0; i--)
            while (balance >= subtractors[i-1]) return balance - subtractors[i-1];
        return balance;
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

    public static long maxDotProduct(int[] listA, int[] listB) {
        Arrays.sort(listA);
        Arrays.sort(listB);
        long sumProduct = 0;

        for (int i = 0; i < listA.length; i++) {
            sumProduct += listA[i] * listB[i];
        }
        return sumProduct;
    }
}
