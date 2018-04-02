package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        PracticeA practiceA = new PracticeA();
        List<String> collectionProcessed = new ArrayList<>();
        for (String element : collection1) {
            int pos;
            if ((pos = element.indexOf("-")) == -1) {
                collectionProcessed.add(element);
            } else {
                int times = Integer.valueOf(element.substring(1 + pos));
                String tmpS = element.substring(0, pos);
                while (times-- > 0) {
                    collectionProcessed.add(tmpS);
                }
            }

        }
        return practiceA.countSameElements(collectionProcessed);
    }

}
