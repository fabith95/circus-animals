package com.masglobalconsulting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Bird implements Mooing {
    private final String name = "Kim";
    private String soundBird;

    public String getSoundBird() {
        return sound();
    }

    public String sound() {
        String sound = "";
        if (name == "Kim") {
            sound = "Fifi";
        }
        return sound;
    }

}
