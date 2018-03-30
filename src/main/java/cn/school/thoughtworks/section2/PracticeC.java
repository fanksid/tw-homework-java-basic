package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        PracticeA practiceA = new PracticeA();
        List<String> collectionProcessed = new ArrayList<>();
        for (String s : collection1) {
            int pos;
            String []splits = {"-", ":", "["};
            boolean isSpecial = false;
            for (int i = 0; i < splits.length; i++) {
                if ((pos = s.indexOf(splits[i])) != -1) {
                    int times;
                    if (splits[i].equals("[")) {
                        int rpos = s.indexOf("]");
                        times = Integer.valueOf(s.substring(1 + pos, rpos));
                    } else {
                        times = Integer.valueOf(s.substring(1 + pos));
                    }

                    String tmpS = s.substring(0, pos);
                    while (times-- > 0) {
                        collectionProcessed.add(tmpS);
                    }
                    isSpecial = true;
                    break;
                }
            }
            if (!isSpecial) {
                collectionProcessed.add(s);
            }

        }
        return practiceA.countSameElements(collectionProcessed);
    }
}
