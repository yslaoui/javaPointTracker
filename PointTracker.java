package pointTracker;

import java.util.ArrayList;
import java.util.HashMap;

public class PointTracker {

    HashMap<String, ArrayList<Integer>> tracker;

    public PointTracker() {
        this.tracker = new HashMap<>();
    }

    public void add(String name, int point) {
        this.tracker.putIfAbsent(name, new ArrayList<Integer>());
        this.tracker.get(name).add(point);
    }

    @Override
    public String toString() {
        String printout = "";
        for (String name: this.tracker.keySet()) {
            System.out.println(name + ": " + this.tracker.get(name));
        }
        return printout;
    }
}




