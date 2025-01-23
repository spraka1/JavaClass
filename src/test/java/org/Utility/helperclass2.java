package org.Utility;

import java.util.ArrayList;
import java.util.List;

public class helperclass2 {

    public static List<List<Object>> createWindowIdValuePairs(String WindowId, Integer WindowIdValue, 
                                                               String WindowId1, Integer WindowIdValue1, 
                                                               String WindowId2, Integer WindowIdValue2) {
        List<Object> li = new ArrayList<>();
        List<Object> li1 = new ArrayList<>();
        List<Object> li2 = new ArrayList<>();
        List<List<Object>> liAll = new ArrayList<>();

        // Populate li if both elements are non-null
        if (WindowId != null && WindowIdValue != null) {
            li.add(WindowId);
            li.add(WindowIdValue);
        }
        
        // Populate li1 if both elements are non-null
        if (WindowId1 != null && WindowIdValue1 != null) {
            li1.add(WindowId1);
            li1.add(WindowIdValue1);
        }

        // Populate li2 if both elements are non-null
        if (WindowId2 != null && WindowIdValue2 != null) {
            li2.add(WindowId2);
            li2.add(WindowIdValue2);
        }

        // Add lists to liAll only if they contain elements
        if (!li.isEmpty()) {
            liAll.add(li);
        }
        
        if (!li1.isEmpty()) {
            liAll.add(li1);
        }
        
        if (!li2.isEmpty()) {
            liAll.add(li2);
        }

        return liAll;
    }
}


