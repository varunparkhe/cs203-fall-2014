package lab6;

import java.util.ArrayList;

public class Road {
    java.util.ArrayList<Segment> segments = 
            new java.util.ArrayList<Segment>();
    String name;

    public void addSegment(Segment segment) {
        segments.add( segment );
    }

    boolean checkCoverage() {
        boolean status = true;
        for (Segment s : segments) {
            if (s.checkCoverage() == false) 
                return false;
        }
        return status;
    }

    public void build(ArrayList<Point> tempPoints) {
        // create segments
        Point p0 = tempPoints.get(0);
        for (int i = 1; i < tempPoints.size(); i++) {
            Point p1 = tempPoints.get(i);
            Segment segment = new Segment(p0, p1);
            addSegment( segment );
            p0 = p1;
        }
    }

    public void dump() {
        for ( Segment segment : segments ) {
            segment.dump();
        }
    }

    public void draw() {
        for ( Segment segment : segments ) {
            segment.draw();
        }
    }
}
