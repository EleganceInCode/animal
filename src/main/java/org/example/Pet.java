package org.example;

import java.util.Date;
import java.util.List;

public class Pet extends Animal {
    public Pet(String name, Date birthDate, List<String> commands) {
        super(name, birthDate, commands);
    }
}
