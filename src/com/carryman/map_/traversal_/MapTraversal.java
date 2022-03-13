package com.carryman.map_.traversal_;

import java.util.*;

/**
 * @author carry man
 * @version 1.0
 */
public class MapTraversal {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("Java核心技术第一卷","霍斯特曼");
        hashMap.put("传习录","王阳明");
        hashMap.put("六祖坛经","慧能");



        //1 得到所有的key集合，获取k-v
        Set set = hashMap.keySet();

        //增强for
        for (Object o : set) {
            System.out.println(hashMap.get(o));
        }
        //迭代器
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(hashMap.get(next));
        }

        //2 得到所有的value
        Collection values = hashMap.values();

        //增强for
        for (Object value : values) {
            System.out.println(value);
        }


        //迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
        }


        //3 通过entryset获取k-v
        Set set1 = hashMap.entrySet();
        System.out.println(set1);
        //增强for
        for (Object o : set1) {
            Map.Entry m=(Map.Entry)o;
            Object key = m.getKey();
            System.out.println(key);
            Object value = m.getValue();
            System.out.println(value);
        }

        //迭代器
        Iterator iterator2 = set1.iterator();

        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            Map.Entry m=(Map.Entry)next;
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }


    }
}
