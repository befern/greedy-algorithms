package com.greedyalgorithms.app;

public class Segment {
    int start;
    int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getEnd() { return end; }

    public boolean containsPoint(int point){ return point >= start && point <= end; }
}
