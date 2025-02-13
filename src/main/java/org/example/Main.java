package org.example;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalRegistry registry = new AnimalRegistry();

        try (Counter counter = new Counter()) {
            while (true) {
                System.out.println("1. Завести новое животное\n2. Показать всех животных\n3. Выход");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите дату рождения (yyyy-mm-dd): ");
                    String dateStr = scanner.nextLine();
                    Date birthDate = java.sql.Date.valueOf(dateStr);
                    System.out.print("Введите команды через запятую: ");
                    List<String> commands = Arrays.asList(scanner.nextLine().split(", "));

                    System.out.println("Выберите тип: 1. Собака 2. Кошка 3. Хомяк 4. Лошадь 5. Верблюд 6. Осел");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    Animal animal = switch (type) {
                        case 1 -> new Dog(name, birthDate, commands);
                        case 2 -> new Cat(name, birthDate, commands);
                        case 3 -> new Hamster(name, birthDate, commands);
                        case 4 -> new Horse(name, birthDate, commands);
                        case 5 -> new Camel(name, birthDate, commands);
                        case 6 -> new Donkey(name, birthDate, commands);
                        default -> throw new IllegalArgumentException("Неверный выбор");
                    };

                    registry.addAnimal(animal);
                    counter.add();
                    System.out.println("Животное добавлено!");
                } else if (choice == 2) {
                    registry.showAnimals();
                } else if (choice == 3) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }


}