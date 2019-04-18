package com.example.demo.design.abstract_factory.example.simple_reflection;

/**
 * <h3>概要:</h3><p>ShapeFactory</p>
 * <h3>功能:</h3><p>图形工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 *
 * @since 0.1
 */
public class ShapeFactory2 {

    private static final String COLOR = "BLUE";

    public Circle createCircle() {
        if ("BLUE".equalsIgnoreCase(COLOR)) {
            return new BlueCircle();
        } else if ("GREEN".equalsIgnoreCase(COLOR)) {
            return new GreenCircle();
        } else {
            return null;
        }
    }

    public Rectangle createRectangle() {
        if ("BLUE".equalsIgnoreCase(COLOR)) {
            return new BlueRectangle();
        } else if ("GREEN".equalsIgnoreCase(COLOR)) {
            return new GreenRectangle();
        } else {
            return null;
        }
    }

    public Square createSquare() {
        if ("BLUE".equalsIgnoreCase(COLOR)) {
            return new BlueSquare();
        } else if ("GREEN".equalsIgnoreCase(COLOR)) {
            return new GreenSquare();
        } else {
            return null;
        }
    }
}
