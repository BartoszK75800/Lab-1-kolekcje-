package BKsoft;

import BKsoft.database.Database;
import BKsoft.database.ListsDatabase;
import BKsoft.database.MapsDatabase;
import BKsoft.database.SetDatabase;

import java.util.Scanner;

/**
 * LAB 1 - kolekcje
 * autor: Bartosz Kloc 259175
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Messages:
        String collectionMessage =
                "Wybierz rodzaj kolekcji: \n"+
                        "1. LinkedList i ArrayList \n"+
                        "2. HashSet i TreeSet \n"+
                        "3. HashMap i TreeMap \n";

        int collection;

        System.out.println(collectionMessage);
        collection = scanner.nextInt();

        /*by nie przepisywac tego samego kodu dla kazdego rodzaju kolekcji i uniknac duzej redundancji
        uzywam interfejsu Database i klasy choice
         */
        if(collection==1){
            Database database = new ListsDatabase();
            Choice choice = new Choice(database);
            choice.action();
        }
        if(collection==2){
            Database database = new SetDatabase();
            Choice choice = new Choice(database);
            choice.action();
            }
        if(collection==3){
            Database database = new MapsDatabase();
            Choice choice = new Choice(database);
            choice.action();
        }
    }
}
