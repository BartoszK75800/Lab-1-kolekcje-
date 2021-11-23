package BKsoft;

public class MountainEqHscode{
    private String peakNameEH;
    private MountainRange rangeEH;
    private int heightEH;

    public MountainEqHscode(Mountain mountain){
        this.peakNameEH = mountain.getPeakName();
        this.heightEH = mountain.getHeight();
        this.rangeEH = mountain.getRange();
    }

    @Override
    public String toString() {
        return "{" +
                peakNameEH +
                ", " + heightEH +
                "m n.p.m., " + rangeEH + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MountainEqHscode that = (MountainEqHscode) o;

        if (heightEH != that.heightEH) return false;
        if (!peakNameEH.equals(that.peakNameEH)) return false;
        return rangeEH == that.rangeEH;
    }

    @Override
    public int hashCode() {
        int result = peakNameEH.hashCode();
        result = 31 * result + rangeEH.hashCode();
        result = 31 * result + heightEH;
        return result;
    }
}
