package com.company;

public class ShopKeeper extends Person implements Seller {
    ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi I'm a shopkeeper!";
    }

    @Override
    public void sellGoods() {
        //todo: Implement the sellGoods method
    }
}
