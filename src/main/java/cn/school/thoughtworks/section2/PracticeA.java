package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> collectionRtn = new HashMap<String, Integer>();
        for (String s : collection1) {
            if (collectionRtn.get(s) == null) {
                collectionRtn.put(s, 0);
            }
            int curValue = collectionRtn.get(s);
            collectionRtn.put(s, ++curValue);
        }
        return collectionRtn;
    }
}
