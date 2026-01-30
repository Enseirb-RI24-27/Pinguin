package com.jad.pinguin;

public class ChickenDressedUpAsAPenguin extends AbstractPenguin {
    public ChickenDressedUpAsAPenguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " the chicken is flapping its wings frantically, trying to swim!");
    }
}
