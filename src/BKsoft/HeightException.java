package BKsoft;

public class HeightException extends Exception{
    public HeightException(){
        super("Nie ma tak wysokich gór na Ziemi, prosze podac wysokosc miedzy 1 a 8848");
    }

    public HeightException(String message){
        super(message);
    }
}
