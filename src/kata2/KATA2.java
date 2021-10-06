package kata2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {
    public static void main(String[] args) {
        int [] data = {12,34,13,57,53,89,23,43,7,13,25,63,89,12,32};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key+ "==>" + histogr.get(key));
        }
    }
}
