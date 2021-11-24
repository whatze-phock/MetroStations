package root;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class Parser {
    static String address = "https://www.moscowmap.ru/metro.html#lines";
    static Map<String, Line> linesAndStations = new HashMap<>();
    static List<Station> stations = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect(address).maxBodySize(0).get();
        // System.out.println(doc);
        Elements elements = doc.getElementsByClass("js-metro-line");
        //System.out.println(elements);
        for (Element j : elements) {
            String result = j.className().replaceAll(".+\\s+ln-", "");
            String text = j.text();
            Line lines = new Line(result, text);
            linesAndStations.put(result, lines);
            //System.out.println(j);
        }
        //System.out.println(linesAndStations);
        Elements stationss = doc.getElementsByClass("js-metro-stations");
        //System.out.println(stations);


        for (Element i : stationss) {
            Line line = linesAndStations.get(i.attr("data-line"));
            //System.out.println(line);
            String result = i.text();

            Station station = new Station(line, result);

            if (linesAndStations.containsKey(i.attr("data-line"))) {
                Line line1 = linesAndStations.get(i.attr("data-line"));
                List<Station> liness =  line1.getStations();
                liness.add(station);
                line1.setStations(liness);
            }




            stations.add(station);

            // System.out.println(i);
        }
        for (Element i : stationss) {
            Line line = linesAndStations.get(i.attr("data-line"));
            String result = i.text();
            System.out.println(result);

            for (Element perehod : i.getElementsByAttribute("data-metrost")) {
                TreeSet<String> list = new TreeSet<>();
                //for(String j:list) {
                //    j.replaceAll("a-zA-Z","");
                //}


                for (Element zzz : perehod.getElementsByClass("t-icon-metroln")) {

                    String result1 = zzz.text();
                   System.out.println(zzz.attr("title"));
                    list.add(result1);
                    for (Station x:line.getStations()) {
                        //if ()
                    }
                    //System.out.println(result1);
                }

                //for (Station i:stations) {
                //    System.out.println(i);
                //}


                //linesAndStations.entrySet().stream().forEach(x -> System.out.println(x+" "+x.getValue().getStations()));


            }


        }
        
    }
}
