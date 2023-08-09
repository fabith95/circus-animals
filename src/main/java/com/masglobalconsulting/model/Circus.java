package com.masglobalconsulting.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Circus {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Circus circus = new Circus();
        System.out.println(circus.show());
    }

    public String show() {
        Cat cat = new Cat();
        Monkey monkey = new Monkey();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Choose which mooing you want? <Cat>, <Monkey>, <Bird>, <Dog>");
        String result = scanner.nextLine();

        ArrayList animals = new ArrayList();
        switch (result) {
            case "Cat":
                animals.add(monkey.getSoundMonkey());
                animals.add(bird.getSoundBird());
                animals.add(dog.getSoundDog());
                int a = (int) (Math.random() * 3);
                return (String) animals.get(a);
            case "Monkey":
                animals.add(cat.getSoundCat());
                animals.add(bird.getSoundBird());
                animals.add(dog.getSoundDog());
                int b = (int) (Math.random() * 3);
                return (String) animals.get(b);
            case "Bird":
                animals.add(cat.getSoundCat());
                animals.add(monkey.getSoundMonkey());
                animals.add(dog.getSoundDog());
                int c = (int) (Math.random() * 3);
                return (String) animals.get(c);
            case "Dog":
                animals.add(cat.getSoundCat());
                animals.add(bird.getSoundBird());
                animals.add(monkey.getSoundMonkey());
                int d = (int) (Math.random() * 3);
                return (String) animals.get(d);
            default:
                System.out.println("Write the correct BEHAVIOR");
                return result;
        }
    }
}

