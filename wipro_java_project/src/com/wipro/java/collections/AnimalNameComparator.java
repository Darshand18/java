package com.wipro.java.collections;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {
	@Override
    public int compare(Animal a1, Animal a2) {
        return a1.getName().compareTo(a2.getName()); // Compare by name alphabetically
    }
}
