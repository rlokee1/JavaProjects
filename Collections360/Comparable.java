package Collections360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Comparable1 {
    int id;
    String name;

    Comparable1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o) {
        return 0;
    }
}

class Second implements Comparator {
    public int compare(Object o1, Object o2) {
        Comparable1 c1 = (Comparable1) o1;
        Comparable1 c2 = (Comparable1) o2;
        if (c1.id > c2.id)
            return -1;
        if (c1.id < c2.id)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(new Comparable1(5, "sql"));
        al.add(new Comparable1(3, "python"));
        al.add(new Comparable1(-2, "java"));

        Collections.sort(al,new Second());
        System.out.println(al);
    }
}
