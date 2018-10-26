package com.example.demo.spi.common.utils;

import java.util.*;


public class CollectionUtil {
    /**
     * 判断集合是否包含指定元素
     * @param source
     * @param lists
     * @return
     */
    public static Boolean contain(String source,List<String> lists){
        if(lists == null || lists.size() <= 0){
            return false;
        }
        if(source == null){
            return false;
        }
        for (String str : lists) {
            if(source.equals(str)){
                return true;
            }
        }
        return false;
    }

    /**
     * 判断集合是否包含指定元素
     * @param source
     * @param lists
     * @return
     */
    public static Boolean containIgnoreCase(String source,List<String> lists){
        if(lists == null || lists.size() <= 0){
            return false;
        }
        if(source == null){
            return false;
        }
        for (String str : lists) {
            if(source.equalsIgnoreCase(str)){
                return true;
            }
        }
        return false;
    }

    /**
     * 集合是否包含
     * @param item
     * @param list
     * @return
     */
    public static Boolean contain(Integer item,List<Integer> list){
        if(list == null || list.size() <= 0){
            return false;
        }
        if(item == null){
            return false;
        }
        for (Integer intItem: list) {
            if(item.equals(intItem)){
                return true;
            }
        }
        return false;
    }

    /**
     * 集合是否包含
     * @param item
     * @param list
     * @return
     */
    public static Boolean contain(Long item,List<Long> list){
        if(list == null || list.size() <= 0){
            return false;
        }
        if(item == null){
            return false;
        }
        for (Long longItem: list) {
            if(item.equals(longItem)){
                return true;
            }
        }
        return false;
    }



    public static final <T extends Comparable<T>, D> Map<T, List<D>> group(Collection<D> colls, IGroupBy<T> gb) {
        if (colls == null || colls.isEmpty()) {
            return null;
        }
        if (gb == null) {
            return null;
        }
        Iterator<D> iter = colls.iterator();
        Map<T, List<D>> map = new HashMap<T, List<D>>();
        while (iter.hasNext()) {
            D d = iter.next();
            T t = gb.groupby(d);
            if (map.containsKey(t)) {
                map.get(t).add(d);
            } else {
                List<D> list = new ArrayList<D>();
                list.add(d);
                map.put(t, list);
            }
        }
        return map;
    }

    public interface IGroupBy<T> {
        T groupby(Object obj);
    }
}
