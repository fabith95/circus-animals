package com.masglobalconsulting.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Monkey implements Mooing {
    private final String name = "Mongo";
    private String soundMonkey;

    public String getName() {
        return name;
    }

    public String getSoundMonkey() {
        return sound();
    }

    public String sound() {
        String sound = "";
        if (name == "Mongo") {
            sound = "Huhuha";
        }
        return sound;
    }

}
