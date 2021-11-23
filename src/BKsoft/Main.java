package BKsoft;

import org.w3c.dom.ranges.RangeException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws HeightException {
        int a;
        Scanner scanner = new Scanner(System.in);

        a=scanner.nextInt();
	Mountain mountain = new Mountain("Everest", a, MountainRange.ALPY);
        System.out.println("Góra: " + mountain.getPeakName() + " wys: " + mountain.getHeight() + " lancuch: "+mountain.getRange());
    }
}
