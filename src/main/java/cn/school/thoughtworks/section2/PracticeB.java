package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        PracticeA practiceA = new PracticeA();
        List<String> collectionProcessed = new ArrayList<>();
        for (String s : collection1) {
            int pos;
            if ((pos = s.indexOf("-")) == -1) {
                collectionProcessed.add(s);
            } else {
                int times = Integer.valueOf(s.substring(1 + pos));
                String tmpS = s.substring(0, pos);
                while (times-- > 0) {
                    collectionProcessed.add(tmpS);
                }
            }

        }
        return practiceA.countSameElements(collectionProcessed);
    }

}
