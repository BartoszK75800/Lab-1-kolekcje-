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
                   MountainEqHscode mtn = new MountainEqHscode(mountain);
                   database.addMountain(mountain, mtn);
             }
                if(activity==2) {
                    Mountain mountain = new Mountain();
                    MountainEqHscode mtn = new MountainEqHscode(mountain);
                    database.delete(mountain, mtn);
                }
                if(activity==3){
                   database.showDatabase();
            }
            }
        }
        if(collection==2){
            Database database = new SetDatabase();
            while(activity!=0){
                System.out.println(activityMessage);
                activity = scanner.nextInt();

                if(activity==1){
                    Mountain mountain = new Mountain();
                    MountainEqHscode mtn = new MountainEqHscode(mountain);
                    database.addMountain(mountain, mtn);
                }
                if(activity==2) {
                    Mountain mountain = new Mountain();
                    MountainEqHscode mtn = new MountainEqHscode(mountain);
                    database.delete(mountain, mtn);
                }
                if(activity==3){
                    database.showDatabase();
                }
            }
        }
        if(collection==3){
            Database database = new MapsDatabase();
            while(activity!=0){
                System.out.println(activityMessage);
                activity = scanner.nextInt();

                if(activity==1){
                    Mountain mountain = new Mountain();
                    MountainEqHscode mtn = new MountainEqHscode(mountain);
                    database.addMountain(mountain, mtn);
                }
                if(activity==2) {
                    Mountain mountain = new Mountain();
                    MountainEqHscode mtn = new MountainEqHscode(mountain);
                    database.delete(mountain, mtn);
                }
                if(activity==3){
                    database.showDatabase();
                }
            }
        }
    }
}
