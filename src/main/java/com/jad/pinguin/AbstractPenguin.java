package com.jad.pinguin;

public abstract class AbstractPenguin {
    private final String name;
    public AbstractPenguin(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract void swim();
}
