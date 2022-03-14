package com.carryman.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author carry man
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pig");
        arrayList.add("cat");
        arrayList.add("kiven");
        arrayList.add("umbroller");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);


        Collections.shuffle(arrayList);
        System.out.println(arrayList);



        Collections.sort(arrayList);
        System.out.println(arrayList);
        
        
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });


        System.out.println(arrayList);



        Collections.swap(arrayList,0,3);
        System.out.println(arrayList);

        int frequency = Collections.frequency(arrayList,"pig");
        System.out.println(frequency);
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("123");
        Collections.copy(arrayList,arrayList1);

        System.out.println(arrayList);

        Collections.replaceAll(arrayList,"cat","tangmu");

        System.out.println(arrayList);

    }
}
