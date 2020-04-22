package cn.designpatterns.观察者模式.observer.impl;

import cn.designpatterns.观察者模式.Subject;
import cn.designpatterns.观察者模式.observer.Observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
