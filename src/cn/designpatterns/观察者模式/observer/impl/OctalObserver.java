package cn.designpatterns.观察者模式.observer.impl;

import cn.designpatterns.观察者模式.Subject;
import cn.designpatterns.观察者模式.observer.Observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
