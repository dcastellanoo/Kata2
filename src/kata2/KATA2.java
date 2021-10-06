package kata2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {
    public static void main(String[] args) {
        int [] data = {12,34,13,57,53,89,23,43,7,13,25,63,89,12,32};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key+ "==>" + histogram.get(key));
        }
    }
    
}
