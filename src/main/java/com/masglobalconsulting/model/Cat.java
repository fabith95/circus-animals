package com.masglobalconsulting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Cat implements Mooing {
    private final String name = "Micka";
    public String getSoundCat() {
        return sound();
    }

    public String sound() {
        String sound = "";
        if (name == "Micka") {
            sound = "Meow";
        }
        return sound;
    }

}
