package root;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String lineNumber;
    private String lineName;
    private List<Station> stations = new ArrayList<>();

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public Line(String lineNumber, String lineName, List<Station> stations) {
        this.lineNumber = lineNumber;
        this.lineName = lineName;
        this.stations = stations;
    }
    public Line(String lineNumber, String lineName) {
        this.lineNumber = lineNumber;
        this.lineName = lineName;
    }
    public Line() {}

    @Override
    public String toString() {
        return "Line" +" "+ lineNumber +" "+  lineName;
    }
}
