package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> collectionRtn = new ArrayList<>();
        collectionRtn.addAll(collection1);
        collectionRtn.retainAll(collection2);
        return collectionRtn;
    }
    
}
