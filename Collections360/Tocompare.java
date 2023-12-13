package Collections360;

import java.util.*;

class Tocompare implements Comparable<Tocompare> {
    int id;
    String name;

    Tocompare(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Tocompare f) {
        if (id > f.id)
            return -1;
        else if (id < f.id)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + "";
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(new Tocompare(4, "one"));
        al.add(new Tocompare(3, "two"));
        al.add(new Tocompare(2, "three"));
        al.add(new Tocompare(5, "four"));

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}