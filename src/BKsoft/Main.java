package BKsoft;

import BKsoft.database.Database;
import BKsoft.database.ListsDatabase;
import BKsoft.database.MapsDatabase;
import BKsoft.database.SetDatabase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Messages:
        String collectionMessage =
                "Wybierz rodzaj kolekcji: \n"+
                        "1. LinkedList i ArrayList \n"+
                        "2. HashSet i TreeSet \n"+
                        "3. HashMap i TreeMap \n";

        String activityMessage =
                "Wybierz czynnosc: \n"+
                        "1. Dodaj element \n"+
                        "2. Usun element \n"+
                        "3. Wyswietl baze danych \n"+
                        "0. ZAKONCZ PROGRAM \n";
        
        int activity = 10;
        int collection;

        System.out.println(collectionMessage);
        collection = scanner.nextInt();

        if(collection==1){
            Database database = new ListsDatabase();
            while(activity!=0){
                System.out.println(activityMessage);
                activity = scanner.nextInt();

                if(activity==1){
                   Mountain mountain = new Mountain();
                  database.addMountain(mountain);
             }
                if(activity==2);
                if(activity==3){
                   int size = database.dataSize();
                   database.showDatabase();
            }
            }
        }
    }
}
