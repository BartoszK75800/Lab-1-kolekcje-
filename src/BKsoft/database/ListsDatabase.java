package BKsoft.database;

import BKsoft.Mountain;
import BKsoft.MountainEqHscode;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsDatabase implements Database{
    private LinkedList<Mountain> mountainLinkedList = new LinkedList<>();
    private ArrayList<Mountain> mountainArrayList = new ArrayList<>();
    private LinkedList<Mountain> mountainLinkedListEH = new LinkedList<>();  //EH oznacza z zaimplementowana przeze mnie equals i hashcode
    private ArrayList<Mountain> mountainArrayListEH = new ArrayList<>();

    @Override
    public void addMountain(Mountain mountain, MountainEqHscode mtn) {
        mountainArrayList.add(mountain);
        mountainLinkedList.add(mountain);
        mountainArrayListEH.add(mtn);
        mountainLinkedListEH.add(mtn);
    }

    @Override
    public void showDatabase() {
        System.out.println("Array List: \n" + mountainArrayList.toString() + "\n");
        System.out.println("Linked List: \n" + mountainArrayList.toString() + "\n");
        System.out.println("Array List (z funkcjami porownawczymi): \n" + mountainArrayListEH.toString() + "\n");
        System.out.println("Linked List: (z funkcjami porownawczymi):\n" + mountainArrayListEH.toString() + "\n");
    }

    @Override
    public int dataSize(){
        return mountainLinkedList.size();
    }
}
