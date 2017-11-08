package com.greedyalgorithms.app;


import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CoveringSegmentsTest extends TestCase{
    OverlappingSegments overlappingSegments;
    List<Segment> segments;
    ArrayList<Integer> resultPoints;

    @Override
    public void setUp(){
        segments = new ArrayList<>();
        resultPoints = new ArrayList<>();
    }

    public void testSimple3SegmentsOptimalPoints(){
        segments.add(new Segment(1,3));
        segments.add(new Segment(2,5));
        segments.add(new Segment(3,6));
        overlappingSegments = new OverlappingSegments(segments);
        resultPoints.add(3);

        assertEquals (resultPoints, overlappingSegments.optimalCoveringPoints());
    }

    public void testUnOrdered4SegmentsOptimalPoints(){
        segments.add(new Segment(4,7));
        segments.add(new Segment(1,3));
        segments.add(new Segment(2,5));
        segments.add(new Segment(5,6));
        overlappingSegments = new OverlappingSegments(segments);
        resultPoints.add(3);
        resultPoints.add(6);

        assertEquals (resultPoints, overlappingSegments.optimalCoveringPoints());
    }

    public void testMaximumSegmentsOptimalPoints(){
        for (int i=0; i<100; i++){ segments.add(new Segment(i+1,1000000000-i)); }
        overlappingSegments = new OverlappingSegments(segments);
        resultPoints.add(1000000000-99);

        assertEquals (resultPoints, overlappingSegments.optimalCoveringPoints());
    }
}
