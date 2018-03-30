package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        // Attention: PracticeA here is actually section2.PracticeA
        PracticeA practiceA = new PracticeA();
        Map<String, Integer> collectionC = practiceA.countSameElements(collectionA);
        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(collectionC, object);
    }
}
