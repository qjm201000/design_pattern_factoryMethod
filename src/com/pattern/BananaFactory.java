package com.pattern;

/**
 * 香蕉工厂
 */
public class BananaFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
