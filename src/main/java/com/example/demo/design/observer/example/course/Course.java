package com.example.demo.design.observer.example.course;


import java.util.ArrayList;

/**
 * <h3>概要:</h3><p>Course</p>
 * <h3>功能:</h3><p>课程类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class Course {
    protected ArrayList<Observer> observers;

    public Course() {
        this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        if (observer == null){
            throw new NullPointerException();
        }

        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addCourse(){
        notifyObserver(OperTypeEnum.ADD);
    }

    public void updateCourse(){
        notifyObserver(OperTypeEnum.UPDATE);
    }

    public void removeCourse(){
        notifyObserver(OperTypeEnum.REMOVE);
    }

    private void notifyObserver(OperTypeEnum operTypeEnum){
        for (Object observer : observers) {
            ((Observer) observer).update(operTypeEnum);
        }
    }
}
