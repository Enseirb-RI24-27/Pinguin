package com.jad.pinguin;

public class OleronPenguin extends AbstractPenguin {
    public OleronPenguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming gracefully in the waters.");
    }
}
