package TaskMaster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class SortSTR {
    String s;
    SortSTR(String s) {
        this.s = s;
    }
    public String toString() {
        return s;
    }
}

class Msg implements Comparator<SortSTR> {
    public int compare(SortSTR t, SortSTR t1) {
        try {
            if (t.s.length() > t1.s.length()) {
                return -1;
            }
            if (t.s.length() < t1.s.length()) {
                return 1;
            } else {
                return 0;
            }
        } catch (RuntimeException e) {
            System.err.println(e);
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(new SortSTR("Antony Das"));
        al.add(new SortSTR("Mark Antony"));
        al.add(new SortSTR("Vijay Antony"));
        al.add(new SortSTR("Leo"));
        al.add(new SortSTR("Vikram"));
        al.add(new SortSTR("Rolex"));
        al.add(new SortSTR("Dilli"));
        al.add(new SortSTR("Parthiban"));
        System.out.println("Before Sorting : " + '\n' + al);
        Collections.sort(al, new Msg());
        System.out.println("After Sorting : " + '\n' + al);
        for (Object s : al) {
            System.out.println(s);
        }
    }
}