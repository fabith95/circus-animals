package com.masglobalconsulting.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Monkey {
    private String name = "Mongo";
    private String soundMonkey;

    public String getName() {
        return name;
    }

    public String getSoundMonkey() {
        return soundMonkey();
    }

    public String soundMonkey(){
        String sound = "";
        if (name == "Mongo") {
            sound = "Huhuha";
        }
        return sound;
    }

}
