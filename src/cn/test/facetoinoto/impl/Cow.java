package cn.test.facetoinoto.impl;

import cn.test.facetoinoto.Animal;

public class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("哞哞~");
    }
}