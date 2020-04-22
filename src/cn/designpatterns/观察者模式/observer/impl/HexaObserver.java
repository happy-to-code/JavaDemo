package cn.designpatterns.观察者模式.observer.impl;

import cn.designpatterns.观察者模式.Subject;
import cn.designpatterns.观察者模式.observer.Observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
