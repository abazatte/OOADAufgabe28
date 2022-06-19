package entity;

import java.util.*;

public class Partei {
    String name;
    Map<String,Person> personen;
    public Partei(String name) {
        this.name = name;
        personen = new HashMap<>();
    }

    public void addPerson(Person person)  {
        //wenn die person schon existiert wird sie nicht reingepackt
        personen.put(person.getName(),person);
    }

    public Person getPersonWithName(String name){
        return personen.get(name);
    }
}
