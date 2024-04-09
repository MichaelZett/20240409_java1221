package de.zettsystems.solution;

import java.util.LinkedList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedExercise {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Last");

        printFirstLast(list);

        System.out.println("Normal: " + list);
        // TODO use new method
        System.out.println("Reversed: " + list.reversed());
        System.out.println("Normal nochmal: " + list);
    }

    // TODO use new interface and make more easy
    private static void printFirstLast(SequencedCollection<String> collection) {
        System.out.println("First: " + collection.getFirst() + " - Last: " + collection.getLast());

    }
}
