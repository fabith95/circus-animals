package com.masglobalconsulting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Dog implements Mooing {
    private final String name = "Bob";
    private String soundDog;

    public String getSoundDog() {
        return sound();
    }

    public String sound() {
        String sound = "";
        if (name == "Bob") {
            sound = "Woof";
        }
        return sound;
    }
}
