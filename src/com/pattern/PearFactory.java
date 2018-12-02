package com.pattern;

/**
 * 梨子工厂
 */
public class PearFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
