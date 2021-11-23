package BKsoft.database;

import BKsoft.Mountain;
import BKsoft.MountainEqHscode;

public interface Database {
    public void addMountain(Mountain mountain, MountainEqHscode mnt);
    public void showDatabase();
}
