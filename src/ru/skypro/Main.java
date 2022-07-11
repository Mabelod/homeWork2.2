package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 12, 113),
                new Person("Иван", 25, 114),
                new Person("Том", 35, 115),
                new Person("Джо", 23, 116),
        };

        Customer[] customers = {
                new Customer("Сара", 30, 112, 145874),
                new Customer("Джон", 12, 113, 145877),
                new Customer("Иван", 25, 114, 145878),
        };

        Gamer[] gamers = {
                new Gamer("Джо", 23, 116, "PC"),
                new Gamer("Джон", 12, 113, "PS"),

        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }
}
