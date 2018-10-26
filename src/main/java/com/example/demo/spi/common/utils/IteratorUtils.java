package com.example.demo.spi.common.utils;

import java.util.Iterator;
import java.util.List;

/**
 * Created by xu_yanga on 2017/10/17.
 */
public class IteratorUtils<T> {
    public  void iteratorDelete(List<T> list, String obj) {
        Iterator<T> it = list.iterator();
        while(it.hasNext())
        {
            T item = it.next();

            if (item.equals(obj))
            {
                it.remove();//删除当前项
            }
        }
    }
}