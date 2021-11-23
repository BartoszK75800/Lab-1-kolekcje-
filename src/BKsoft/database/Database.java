package BKsoft.database;

import BKsoft.Mountain;
import BKsoft.MountainEqHscode;

public interface Database {
    void addMountain(Mountain mountain, MountainEqHscode mnt);
    void showDatabase();
    void delete(Mountain mountain, MountainEqHscode mtn);
}
