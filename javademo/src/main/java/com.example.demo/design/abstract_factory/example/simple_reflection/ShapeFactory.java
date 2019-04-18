package com.example.demo.design.abstract_factory.example.simple_reflection;

/**
 * <h3>概要:</h3><p>ShapeFactory</p>
 * <h3>功能:</h3><p>图形工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 *
 */
public class ShapeFactory {

    private static String color = "";

    public ShapeFactory() {
        try {
            String path = Thread.currentThread().getContextClassLoader().getResource("source.properties").getPath();
            color = new PropertiesUtils(path).readProperties("color");
            } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public Circle createCircle() {
        try {
            Class<?> classType = Class.forName("com.lianggzone.designpattern.abstract_factory.example.simple_reflection." + color + "Circle");
            return (Circle) classType.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

    public Rectangle createRectangle() {
        try {
            Class<?> classType = Class.forName("com.lianggzone.designpattern.abstract_factory.example.simple_reflection." + color + "Rectangle");
            return (Rectangle) classType.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

    public Square createSquare() {
        try {
            Class<?> classType = Class.forName("com.lianggzone.designpattern.abstract_factory.example.simple_reflection." + color + "Square");
            return (Square) classType.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
