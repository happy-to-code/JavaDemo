package cn.test.facetoinoto.impl;

import cn.test.facetoinoto.Animal;

public class Pig implements Animal {
    @Override
    public void makeSound() {
        System.out.println("pig~pig~");
    }
}