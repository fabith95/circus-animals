package com.masglobalconsulting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Bird {
    private final String name = "Kim";
    private String soundBird;

    public String getSoundBird() {
        return soundBird();
    }

    public String soundBird(){
        String sound = "";
        if (name == "Kim") {
            sound = "Fifi";
        }
        return sound;
    }

}
