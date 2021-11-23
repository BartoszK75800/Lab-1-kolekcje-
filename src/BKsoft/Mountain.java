package BKsoft;

import java.util.Scanner;

public class Mountain {
    private String peakName;
    private MountainRange range;
    private int height;

    public Mountain() {
        this.setPeakName();
        this.setHeight();
        this.setRange();
    }

    public String getPeakName() {
        return peakName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        int height = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosze podac wysokosc: ");
        while(height<1 || height>8848){
            height = scanner.nextInt();
            if(height<1 || height>8848) System.out.println("Nie ma takich gor na Ziemi. Prosze wartosc miedzy 0 a 8848.");
        }
        this.height = height;
    }

    public MountainRange getRange() {
        return range;
    }

    public void setRange() {
        String message =
                "Prosze wybrac lancuhc gorski. Wprowadzenie innej liczby zostanie uznane jako 'inny' \n"+
                        "0. inny \n" +
                        "1. Alpy \n" +
                        "2. Apeniny \n" +
                        "3. Himalaje \n" +
                        "4. Karakorum \n" +
                        "5. Karpaty \n" +
                        "6. Kaukaz \n" +
                        "7. Pireneje \n" +
                        "8. Sudety \n" +
                        "9. Ural \n";

        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x){
            case 1: {
                this.range=MountainRange.ALPY;
                break;
            }
            case 2: {
                this.range=MountainRange.APENINY;
                break;
            }
            case 3: {
                this.range=MountainRange.HIMALAJE;
                break;
            }
            case 4: {
                this.range=MountainRange.KARAKORUM;
                break;
            }
            case 5: {
                this.range=MountainRange.KARPATY;
                break;
            }
            case 6: {
                this.range=MountainRange.KAUKAZ;
                break;
            }
            case 7: {
                this.range=MountainRange.PIRENEJE;
                break;
            }
            case 8: {
                this.range=MountainRange.SUDETY;
                break;
            }
            case 9: {
                this.range=MountainRange.URAL;
                break;
            }
            default: {
                this.range=MountainRange.INNY;
                break;
            }
        }
    }

    public void setPeakName() {
        System.out.println("Prosze podac nazwe: ");
        Scanner scanner = new Scanner(System.in);

        String peakName = scanner.next();
        this.peakName = peakName;
    }

    @Override
    public String toString() {
        return "{" +
                peakName +
                ", " + height +
                "[m n.p.m., " + range + "}";
    }
}

