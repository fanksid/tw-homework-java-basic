package cn.school.thoughtworks.section1;

import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        PracticeA practiceA = new PracticeA();
        return practiceA.collectSameElements(collection1, collection2.get(0));
    }
}
