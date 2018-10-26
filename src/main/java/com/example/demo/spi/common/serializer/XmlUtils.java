package com.example.demo.spi.common.serializer;

import com.thoughtworks.xstream.XStream;

/**
 * Created by xu_yanga on 2017/10/12.
 */
public class XmlUtils {
    public static String toXml(Object object) {
        if (object != null) {
            return new XStream().toXML(object);
        }
        return null;
    }
    public static Object fromXml(String xml, Object object) {
        if (xml != null && object != null) {
            return  new XStream().fromXML(xml, object);
        }
        return null;
    }
}
