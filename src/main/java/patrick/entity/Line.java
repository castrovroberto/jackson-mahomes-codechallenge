package patrick.entity;

import java.util.Arrays;

public class Line {
    private String lineName;
    private int[] occurrences;

    public Line(String lineName, int[] occurrences) {
        this.lineName = lineName;
        this.occurrences = occurrences;
    }

    public Line() {
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public int[] getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(int[] occurrences) {
        this.occurrences = occurrences;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineName='" + lineName + '\'' +
                ", occurrences=" + Arrays.toString(occurrences) +
                '}';
    }
}
