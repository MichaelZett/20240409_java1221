package de.zettsystems.solution;

public interface Pet {
    String getName();
}

record Dog(String name) implements Pet {

    public String getName() {
        return name;
    }
}

record Cat(String name) implements Pet {

    public String getName() {
        return name;
    }
}

record Fish(String name) implements Pet {

    public String getName() {
        return name;
    }
}