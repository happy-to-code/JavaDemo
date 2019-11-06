package cn.test.facetoinoto.impl;

import cn.test.facetoinoto.Animal;

public class Chicken implements Animal {
    @Override
    public void makeSound() {
        System.out.println("叽叽~叽叽~");
    }
}