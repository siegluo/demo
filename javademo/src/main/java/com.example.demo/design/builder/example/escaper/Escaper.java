package com.example.demo.design.builder.example.escaper;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>概要:</h3><p>Escaper</p>
 * <h3>功能:</h3><p>Escaper</p>
 * <h3>履历:</h3>
 * <li>2017年5月23日  v0.1 版本内容: 新建</li>
 */
public final class Escaper {

    public final Map<String, String> replacementMap;
    
    private Escaper(Builder builder) {
        replacementMap = builder.replacementMap;
    }
    
    public static final class Builder {
        private final Map<String, String> replacementMap = new HashMap<String, String>();

        public Builder addEscape(String regex, String replacement) {
            replacementMap.put(regex, replacement);
            return this;
        }

        public Escaper build() {
            return new Escaper(this);
        }
    }
}
