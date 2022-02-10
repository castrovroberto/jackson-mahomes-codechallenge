package patrick.entity;

import java.util.ArrayList;
import java.util.List;

public class OutputJson {
    private List<Line> occurrences;
    private int totalOccurrences;

    public OutputJson() {
    }

    public OutputJson(List<Line> occurrences, int totalOccurrences) {
        this.occurrences = occurrences;
        this.totalOccurrences = totalOccurrences;
    }

    public List<Line> getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(List<Line> occurrences) {
        this.occurrences = occurrences;
    }

    public int getTotalOccurrences() {
        return totalOccurrences;
    }

    public void setTotalOccurrences(int totalOccurrences) {
        this.totalOccurrences = totalOccurrences;
    }

    public void addLine(String text, int instances) {
        if (this.occurrences == null) {
            this.occurrences = new ArrayList<>();
        }
        //this.occurrences.add(new Line("Line " + String.valueOf(this.occurrences.size() + 1) + ": "), occurrences);
        this.occurrences.add(new Line("Line: ", instances));
    }

    @Override
    public String toString() {
        return "OutputJson{" +
                "occurrences=" + occurrences +
                ", totalOccurrences=" + totalOccurrences +
                '}';
    }
}
