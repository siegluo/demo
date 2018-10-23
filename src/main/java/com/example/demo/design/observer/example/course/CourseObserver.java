package com.example.demo.design.observer.example.course;

/**
 * <h3>概要:</h3><p>ConcreteObserver</p>
 * <h3>功能:</h3><p>具体的观察者类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class CourseObserver implements Observer {

    @Override
    public void update(OperTypeEnum operTypeEnum) {
        switch (operTypeEnum) {
            case ADD:
                System.out.println("新增课程");
                break;
            case UPDATE:
                System.out.println("更新课程");
                break;
            case REMOVE:
                System.out.println("删除课程");
                break;
            default:
                break;
        }
    }
}