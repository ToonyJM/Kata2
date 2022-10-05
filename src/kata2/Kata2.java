package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "Maria", "Pepe", "Pepe", "Rosa", "Rosa", "Maria", "Pepe", "Pepe", "Rosa", "Maria", "Rosa"};
        HistogramGenerator histogramGenerator = new HistogramGenerator<String>(data);
        Map<String,Integer> histogram = histogramGenerator.getHistogram();
      
        for (Map.Entry<String,Integer> entry  : histogram.entrySet()) {
            System.out.println(entry.getKey() + "====> " + entry.getValue());
        }
    }
}
