package BKsoft;

import org.w3c.dom.ranges.RangeException;

import java.util.Scanner;

public class Mountain {
    private String peakName;
    private MountainRange range;
    private int height;

    public Mountain(String PeakName, int height, MountainRange range) throws HeightException, RangeException {
        this.peakName = PeakName;
        setHeight(height);
        this.range = range;
    }

    public String getPeakName() {
        return peakName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        try{
            this.height = height;
            if(height<1 || height>8848) throw new HeightException();
        } catch (HeightException e) {
            System.out.println(e.getMessage());
        }
    }

    public MountainRange getRange() {
        return range;
    }

    public void setRange() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x){
            case 0: this.range=MountainRange.INNY;
            case 1: this.range=MountainRange.ALPY;
            case 2: this.range=MountainRange.APENINY;
            case 3: this.range=MountainRange.HIMALAJE;
            case 4: this.range=MountainRange.KARAKORUM;
            case 5: this.range=MountainRange.KARPATY;
            case 6: this.range=MountainRange.KAUKAZ;
            case 7: this.range=MountainRange.PIRENEJE;
            case 8: this.range=MountainRange.SUDETY;
            case 9: this.range=MountainRange.URAL;
            default: this.range=MountainRange.INNY;
        }
    }
}

