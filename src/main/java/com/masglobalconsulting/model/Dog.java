package com.masglobalconsulting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Dog {
    private final String name = "Bob";
    private String soundDog;

    public String getSoundDog() {
        return soundDog();
    }

    public String soundDog(){
        String sound = "";

        if (name == "Bob") {
            sound = "Woof";
        }
        return sound;
    }
}
