package cn.designpatterns.过滤器模式.service;

import cn.designpatterns.过滤器模式.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
