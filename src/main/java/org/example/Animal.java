package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Animal {
    private String name;
    private Date birthDate;
    private List<String> commands;

    public Animal(String name, Date birthDate, List<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>(commands);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Calendar today = Calendar.getInstance();
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        return today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }
}
