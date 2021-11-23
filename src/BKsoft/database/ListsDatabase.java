package BKsoft.database;

import BKsoft.Mountain;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsDatabase implements Database{
    private LinkedList<Mountain> mountainLinkedList = new LinkedList<>();
    private ArrayList<Mountain> mountainArrayList = new ArrayList<>();

    @Override
    public void addMountain(Mountain mountain) {
        mountainArrayList.add(mountain);
        mountainLinkedList.add(mountain);
    }

    @Override
    public void showDatabase() {

    }
}
