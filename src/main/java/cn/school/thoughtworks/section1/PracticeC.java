package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        PracticeA practiceA = new PracticeA();
        return practiceA.collectSameElements(collection1, collection2.get("value"));
    }
}
