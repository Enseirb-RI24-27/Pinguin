package com.jad.pinguin;

public class StonePenguin extends AbstractPenguin {
    public StonePenguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getName());
    }
}
