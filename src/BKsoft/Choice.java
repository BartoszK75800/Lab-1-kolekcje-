package BKsoft;

import BKsoft.database.Database;

import java.util.Scanner;

public class Choice {
    private final String activityMessage =
            "Wybierz czynnosc: \n"+
                    "1. Dodaj element \n"+
                    "2. Usun element \n"+
                    "3. Wyswietl baze danych \n"+
                    "0. ZAKONCZ PROGRAM \n";
    private int activity=10;
    Database database;

    public Choice(Database database){
        this.database=database;
    }

    public void action(){
        while (this.activity!=0){
            Scanner scanner = new Scanner(System.in);
            System.out.println(activityMessage);
            activity = scanner.nextInt();
            if(activity==1) {
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
