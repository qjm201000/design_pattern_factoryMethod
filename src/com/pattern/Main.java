package com.pattern;

public class Main {
    public static void main(String[] args){
        FruitFactory appFactory = new AppFactory();//苹果工厂
        Fruit app = appFactory.getFruit();
        app.pick();//采摘

        FruitFactory bananaFactory = new BananaFactory();//香蕉工厂
        Fruit banana = bananaFactory.getFruit();
        banana.pick();//采摘

        FruitFactory pearFactory = new PearFactory();//梨子工厂
        Fruit pear = pearFactory.getFruit();
        pear.pick();//采摘
    }
}
