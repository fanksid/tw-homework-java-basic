package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        // Attention: PracticeB here is actually section2.PracticeB
        cn.school.thoughtworks.section2.PracticeB practiceBSection2 = new cn.school.thoughtworks.section2.PracticeB();
        Map<String, Integer> collection3 = practiceBSection2.countSameElements(collectionA);
        PracticeB practiceBSection3 = new PracticeB();

        return practiceBSection3.createUpdatedCollection(collection3, object);
    }
}
