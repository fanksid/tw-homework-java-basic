package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        PracticeA practiceA = new PracticeA();
        List<String> collectionProcessed = new ArrayList<>();
        for (String element : collection1) {
            String[] splits = {"-", ":", "["};
            boolean isSpecial = handleSpecialCaseAndReturnSpecialTag(collectionProcessed, element, splits);

            if (!isSpecial) {
                collectionProcessed.add(element);
            }

        }
        return practiceA.countSameElements(collectionProcessed);
    }

    private boolean handleSpecialCaseAndReturnSpecialTag(List<String> collectionProcessed, String element, String[] splits) {
        boolean isSpecial = false;
        int pos;
        for (String split : splits) {
            if ((pos = element.indexOf(split)) == -1) {
                continue;
            }

            int times;
            if (split.equals("[")) {
                int rpos = element.indexOf("]");
                times = Integer.valueOf(element.substring(1 + pos, rpos));
            } else {
                times = Integer.valueOf(element.substring(1 + pos));
            }

            String tmpS = element.substring(0, pos);
            while (times-- > 0) {
                collectionProcessed.add(tmpS);
            }
            isSpecial = true;
            break;
        }
        return isSpecial;
    }
}
