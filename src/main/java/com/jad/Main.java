package com.jad;

import com.jad.pinguin.ChickenDressedUpAsAPenguin;
import com.jad.pinguin.MadagascarPenguin;
import com.jad.pinguin.OleronPenguin;
import com.jad.pinguin.StonePenguin;

public class Main {
    public static void main(String[] args) {
        Iceberg iceberg = new Iceberg();
        iceberg.add(new OleronPenguin("Oleron"));
        iceberg.add(new StonePenguin("Rocky"));
        iceberg.add(new MadagascarPenguin("Glider"));
        iceberg.add(new ChickenDressedUpAsAPenguin("Clucky"));
        iceberg.swimAll();

        // Une gentille fée vient voir Rocky. Il a été toute sa vie un très gentil pingouin.
        // Elle lui lance un sort et maintenant, il nage comme un dieu

        iceberg.swimAll();
        // Rocky : je nage comme un dieu
    }
}