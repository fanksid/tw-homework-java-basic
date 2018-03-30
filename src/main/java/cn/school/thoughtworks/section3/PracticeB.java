package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> collectionB = object.get("value");
        List<String> collectionTmp = new ArrayList<>();
        for (String s : collectionB) {
            Integer value;
            if ((value = collectionA.get(s)) != null) {
                int times = value / 3;
                while (times-- > 0) {
                    collectionTmp.add(s);
                }
            }
        }
        Map<String , List<String >> mp = new HashMap<>();
        mp.put("value", collectionTmp);
        return (new PracticeA()).createUpdatedCollection(collectionA, mp);
    }
}
