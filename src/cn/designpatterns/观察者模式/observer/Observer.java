package cn.designpatterns.观察者模式.observer;

import cn.designpatterns.观察者模式.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
