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

        // Astuce : il s'agit du DP Strategy

        // Rocky prend la confiance et se met une casquette, des lunettes de soleils et des palmes
        // Glider jaloux, mets lui aussi une casquette
        iceberg.swimAll();
        // Rocky avec une casquette, des lunettes et des palmes : je nage comme un dieu
        // Glider avec une casquette : is swimming gracefully in the waters.

        // Astuce : il s'agit du DP decorator
    }
}