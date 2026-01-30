package com.jad;

import com.jad.pinguin.AbstractPenguin;

import java.util.ArrayList;

public class Iceberg extends ArrayList<AbstractPenguin> {
    public void swimAll() {
        for (AbstractPenguin penguin : this) {
            penguin.swim();
        }
    }
}
