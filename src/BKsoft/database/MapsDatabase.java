package BKsoft.database;

import BKsoft.Mountain;

import java.util.HashMap;
import java.util.TreeMap;

public class MapsDatabase implements Database{
    private HashMap<Integer, Mountain> mountainHashMap = new HashMap<>();
    private TreeMap<Integer, Mountain> mountainTreeMap = new TreeMap<>();

    @Override
    public void addMountain(Mountain mountain) {
        mountainHashMap.put(mountain.hashCode(),mountain);
    }

    @Override
    public void showDatabase() {

    }

    @Override
    public int dataSize() {
        return mountainHashMap.size();
    }
}
