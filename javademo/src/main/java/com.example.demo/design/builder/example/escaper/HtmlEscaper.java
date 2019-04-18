package com.example.demo.design.builder.example.escaper;

import java.util.Map;

/**
 * <h3>概要:</h3><p>HtmlEscaper</p>
 * <h3>功能:</h3><p>HtmlEscaper</p>
 * <h3>履历:</h3>
 * <li>2017年5月23日  v0.1 版本内容: 新建</li>
 */
public final class HtmlEscaper {

    private HtmlEscaper() {}


    public static String escape(String text){
        Map<String, String> replacementMap = HTML_ESCAPER.replacementMap;
        for (String replacement : replacementMap.keySet()) {
            text = text.replaceAll(replacement, replacementMap.get(replacement));
        }
        return text;
    }

    private static final Escaper HTML_ESCAPER = new Escaper.Builder()
        .addEscape("\"", "&quot;")
        .addEscape("'", "&#39;")
        .addEscape("&", "&amp;")
        .addEscape("<", "&lt;")
        .addEscape(">", "&gt;").build();

}
