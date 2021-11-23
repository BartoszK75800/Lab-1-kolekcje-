package BKsoft.database;

import BKsoft.Mountain;
import BKsoft.MountainEqHscode;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDatabase implements Database{
    private HashSet<Mountain> mountainHashSet = new HashSet<>();
    //private TreeSet<Mountain> mountainTreeSet = new TreeSet<>();
    private HashSet<MountainEqHscode> mountainHashSetEH = new HashSet<>();
    //private TreeSet<MountainEqHscode> mountainTreeSetEH = new TreeSet<>();

    @Override
    public void addMountain(Mountain mountain, MountainEqHscode mtn) {
        mountainHashSet.add(mountain);
        //mountainTreeSet.add(mountain);
        mountainHashSetEH.add(mtn);
       // mountainTreeSetEH.add(mtn);
    }

    @Override
    public void showDatabase() {
        System.out.println("HashSet: \n" + mountainHashSet.toString() + "\n");
        //System.out.println("TreeSet: \n" + mountainTreeSet.toString() + "\n");
        System.out.println("HashSet (z funkcjami porownawczymi): \n" + mountainHashSetEH.toString() + "\n");
        //System.out.println("TreeSet: (z funkcjami porownawczymi):\n" + mountainTreeSetEH.toString() + "\n");
    }

    @Override
    public void delete(Mountain mountain, MountainEqHscode mtn) {
        mountainHashSet.remove(mountain);
        mountainHashSetEH.remove(mtn);
    }

}
