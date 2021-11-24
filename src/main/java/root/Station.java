package root;

import java.util.Set;
import java.util.TreeSet;

public class Station {
    private Line lineName;
    private String stationName;
    private Set<String> perehod = new TreeSet<>();

    public Line getLineName() {
        return lineName;
    }

    public void setLineName(Line lineName) {
        this.lineName = lineName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Station(Line lineName, String stationName) {
        this.lineName = lineName;
        this.stationName = stationName;
    }
    public Station(String stationName) {
        this.stationName = stationName;
    }


    public Station () {}

    @Override
    public String toString() {
        return "Station" + lineName + " "+ stationName+" "+perehod;
    }
}
