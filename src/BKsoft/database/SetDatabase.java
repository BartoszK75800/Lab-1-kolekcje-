package BKsoft.database;

import BKsoft.Mountain;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDatabase implements Database{
    private HashSet<Mountain> mountainHashSet = new HashSet<>();
    private TreeSet<Mountain> mountainTreeSet = new TreeSet<>();

    @Override
    public void addMountain(Mountain mountain) {
        mountainHashSet.add(mountain);
        mountainTreeSet.add(mountain);
    }

    @Override
    public void showDatabase() {

    }

    @Override
    public int dataSize(){
        return mountainHashSet.size();
    }
}
