package Collections360;

import java.util.*;

public class Both {
    int id;
    String name;

    Both(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + "";
    }
}

class Bothid implements Comparator {
    public int compare(Object a, Object b) {
        Both s = (Both) a;
        Both s1 = (Both) b;
        if(s.id > s1.id)
        return 1;
		else if (s.id < s1.id)
            return -1;
        else
            return 0;
    }
}

class Bothstr implements Comparator {
    public int compare(Object a, Object b) {
        Both s = (Both) a;
        Both s1 = (Both) b;
        int a1 = s.name.compareTo(s1.name);
        if (a1 > 1)
            return -1;
        else if (a1 < 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList al2 = new ArrayList<>();
        al2.add(new Both(4, "one"));
        al2.add(new Both(3, "two"));
        al2.add(new Both(2, "three"));
        al2.add(new Both(5, "four"));
        System.out.println(al2);
        Collections.sort(al2, new Bothid());
        System.out.println(al2);
        Collections.sort(al2, new Bothstr());
        System.out.println(al2);
    }
}


