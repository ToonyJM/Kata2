package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {
    private final int[] data;

    public HistogramGenerator(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
 
    Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);   
        }      
        return histogram;
    }
}
