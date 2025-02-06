package com.wipro.java.collections;

import java.util.*;

public class AnimalAgeComparator implements Comparator<Animal>{
	@Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Compare by age
    }
}

