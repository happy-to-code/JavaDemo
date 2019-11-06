package cn.test.facetoinoto;

import cn.test.facetoinoto.impl.Chicken;
import cn.test.facetoinoto.impl.Cow;
import cn.test.facetoinoto.impl.Pig;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/5/7
 */
public class Test {
    public static void main(String[] args) {
        hearSound(new Cow());
        hearSound(new Pig());
        hearSound(new Chicken());

    }

    public static void hearSound(Animal animal) {
        animal.makeSound();
    }
}
