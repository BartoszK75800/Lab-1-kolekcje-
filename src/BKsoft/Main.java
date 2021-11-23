package BKsoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Mountain mountain = new Mountain("Everest");

        System.out.println("Góra: " + mountain.getPeakName() + " wys: " + mountain.getHeight() + " lancuch: "+mountain.getRange());
        System.out.println(mountain.getRange());
    }
}
