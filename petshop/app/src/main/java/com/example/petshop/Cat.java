package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {

    public Cat (String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    public String speak() {
        return "meow";
    }
    public void pet() {

    }
}
