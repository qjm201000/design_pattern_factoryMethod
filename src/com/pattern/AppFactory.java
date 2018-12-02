package com.pattern;

/**
 * 苹果工厂
 */
public class AppFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
