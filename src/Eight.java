import java.util.HashMap;

//     Write the program that tell you which line pass through particular stations.
//                  Just use Zone 1 stations name
public class Eight {
    public static void main(String[] args) {
        HashMap<String, String> stationlines = new HashMap<String, String>();
    // add key (station Name) and value (line name)
    stationlines.put("Oxford Circus", "Bakerloo");
    stationlines.put("Waterloo", "Bakerloo");
    stationlines.put("King cross", "Victoria");
    stationlines.put("London", "Bakerloo");
    stationlines.put("Heathrow", "Picadilly");
    // print Station & linesname of Zone 1
        System.out.println("Station & lines in Zone 1");
        System.out.println(stationlines);
}}
