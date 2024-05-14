package pointTracker;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        PointTracker tracker = new PointTracker();
        tracker.add("Ada", 4);
        tracker.add("Ada", 5);
        tracker.add("Arthur", 10);
        tracker.add("Arthur", 10);
        tracker.add("Arthur", 20);
        tracker.add("Arthur", 50);

        tracker.toString();
    }
}
