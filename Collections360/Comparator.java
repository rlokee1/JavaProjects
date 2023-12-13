package Collections360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Comp1 {
    int id;
    String name;

    Comp1(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" : "+name;
    }
}
class Two2 implements Comparator{
    public int compare(Object o1,Object o2){
        Comp1 c1 = (Comp1) o1;
        Comp1 c2 = (Comp1) o2;
        if (c1.id>c2.id)
            return 1;
        if(c1.id<c2.id)
            return -1;
        else
            return 0;
    }
    public static void main(String[]args){
        ArrayList al = new ArrayList<>();
        al.add(new Comp1(5,"sql"));
        al.add(new Comp1(3,"java"));
        al.add(new Comp1(-2,"python"));

        Collections.sort(al,new Two2());
        System.out.println(al);
    }
}
