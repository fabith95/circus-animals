package com.masglobalconsulting.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dog {
    private String name = "Bob";
    private String soundDog;

    public String getName() {
        return name;
    }

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
