package com.jad.pinguin;

public class MadagascarPenguin extends AbstractPenguin {
    public MadagascarPenguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming gracefully in the waters.");
    }
}
