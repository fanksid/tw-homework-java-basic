package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    public Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> collectionRtn = new HashMap<>();
        for (String s : collection1) {
            collectionRtn.putIfAbsent(s, 0);
            int curValue = collectionRtn.get(s);
            collectionRtn.put(s, ++curValue);
        }
        return collectionRtn;
    }
}
