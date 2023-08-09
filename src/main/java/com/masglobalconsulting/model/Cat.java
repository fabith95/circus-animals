package com.masglobalconsulting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Cat {
    private final String name = "Micka";
    private String soundCat;

    public String getSoundCat() {
        return soundCat();
    }

    public String soundCat(){
        String sound = "";
        if (name == "Micka") {
            sound = "Meow";
        }
        return sound;
    }

}
