package BKsoft.database;

import BKsoft.Mountain;
import BKsoft.MountainEqHscode;

import java.util.HashMap;
import java.util.TreeMap;

public class MapsDatabase implements Database{
    private HashMap<Mountain, Integer> mountainHashMap = new HashMap<>();
    //private TreeMap<Mountain, Integer> mountainTreeMap = new TreeMap<>();
    private HashMap<MountainEqHscode, Integer> mountainHashMapEH = new HashMap<>();
    //private TreeMap<Mountain, Integer> mountainTreeMapEH = new TreeMap<>();
    Integer num=0;

    @Override
    public void addMountain(Mountain mountain, MountainEqHscode mtn) {
        this.num++;
        mountainHashMap.put(mountain, num);
        //mountainTreeMap.put(mountain,num);
        mountainHashMapEH.put(mtn, num);
        //mountainTreeMapEH.put(mtn, num);
    }

    @Override
    public void showDatabase() {
        System.out.println("HashMap: \n" + mountainHashMap.toString() + "\n");
        //System.out.println("TreeMap: \n" + mountainTreeMap.toString() + "\n");
        System.out.println("HashMap (z funkcjami porownawczymi): \n" + mountainHashMapEH.toString() + "\n");
        //System.out.println("TreeMap (z funkcjami porownawczymi):\n" + mountainTreeMapEH.toString() + "\n");
    }

    @Override
    public void delete(Mountain mountain, MountainEqHscode mtn) {
        mountainHashMap.remove(mountain);
        mountainHashMapEH.remove(mtn);
    }
}
