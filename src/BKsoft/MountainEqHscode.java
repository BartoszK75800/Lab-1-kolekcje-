package BKsoft;

public class MountainEqHscode extends Mountain{
    private String peakName;
    private MountainRange range;
    private int height;

    public MountainEqHscode(){
        this.peakName = super.getPeakName();
        this.height = super.getHeight();
        this.range = super.getRange();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MountainEqHscode that = (MountainEqHscode) o;

        if (height != that.height) return false;
        if (!peakName.equals(that.peakName)) return false;
        return range == that.range;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + peakName.hashCode();
        result = 31 * result + height;
        return result;
    }
}
