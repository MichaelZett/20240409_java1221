package de.zettsystems.solution;

public class PetCare {
    //TODO use pattern matching for switch with record pattern
    public static String suggestActivity(Pet pet) {
        return switch (pet) {
            case Dog dog -> "Take " + dog.getName() + " for a walk";
            case Cat cat -> "Play with " + cat.getName() + " and a laser pointer";
            case Fish fish -> "Watch " + fish.getName() + " swim around";
            case null, default -> "Unknown pet";
        };
    }

    public static String suggestActivityRecord(Pet pet) {
        return switch (pet) {
            case Dog(String name) -> "Take %s for a walk".formatted(name);
            case Cat(String name) -> "Play with %s and a laser pointer".formatted(name);
            case Fish(String name) -> "Watch %s swim around".formatted(name);
            case null, default -> "Unknown pet";
        };
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Fish fish = new Fish("Nemo");

        System.out.println(suggestActivity(dog));
        System.out.println(suggestActivity(cat));
        System.out.println(suggestActivityRecord(fish));
    }
}
