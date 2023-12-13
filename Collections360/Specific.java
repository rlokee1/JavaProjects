package Collections360;

import java.util.ArrayList;
import java.util.Collections;

class Specific implements Comparable {
    int id;
    String name;

    Specific(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    public int compareTo(Object o1) {
        Specific s = (Specific) o1;
        if (id > s.id)
            return -1;
        else if (id < s.id)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(new Specific(3, "Hi"));
        al.add(new Specific(-1, "Hello"));
        al.add(new Specific(0, "Everyone"));
        al.add(new Specific(2, "I'm"));
        al.add(new Specific(4, "Lokesh"));

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}