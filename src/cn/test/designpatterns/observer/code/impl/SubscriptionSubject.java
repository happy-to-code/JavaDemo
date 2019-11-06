package cn.test.designpatterns.observer.code.impl;

import cn.test.designpatterns.observer.code.Observer;
import cn.test.designpatterns.observer.code.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题
 */
public class SubscriptionSubject implements Subject {
    /**
     * 储存订阅公众号的微信用户
     */
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}