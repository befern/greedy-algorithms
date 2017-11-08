package com.greedyalgorithms.app;

import java.util.ArrayList;
import java.util.List;

public class ListStub<T extends Object>{
    List<T> list = new ArrayList<>();

    public ListStub(T... elements){
        for (int i=0; i<elements.length; i++) list.add(elements[i]);
    }

    public List<T> getList(){ return list; }
}
