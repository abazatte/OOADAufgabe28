package entity;

public class Person {
    private String name;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    public boolean aktiv() {
        return false;
    }

    public void parteilob() {
    }

    public void parteitadel() {
    }

    public void wirtschaftslob() {
    }

    public void erwischt() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
