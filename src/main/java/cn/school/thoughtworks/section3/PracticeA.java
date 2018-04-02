package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collectionRtn = new HashMap<>(collectionA);
        for (String s : object.get("value")) {
            Integer value;
            if ((value = collectionRtn.get(s)) != null) {
                collectionRtn.put(s, --value);
            }
        }
        return collectionRtn;
    }
}
