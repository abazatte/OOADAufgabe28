package entity;

import java.util.HashSet;
import java.util.Set;

public class Partei {
    String name;
    Set<Person> personen;
    public Partei(String name) {
        this.name = name;
        personen = new HashSet<>();
    }
}
