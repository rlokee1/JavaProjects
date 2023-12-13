package Collections360;

import java.util.ArrayList;
import java.util.List;

public class Mapping {
    int id;
    String name,dept,gender;

    public static void main(String[]args){
        Mapping m = new Mapping();
        List li = new ArrayList();
        li.add(0,'o');
        li.add(1,'w');
        li.add(2,'l');
        System.out.println(li);

        List li1 = new ArrayList();
        li1.add('b');
        li1.add('a');
        li1.add('r');
        li1.addAll(1,li);
        System.out.println(li1);
        li1.remove(2);

        System.out.println(li1);
        li1.set(0,'p');
        System.out.println(li1);
    }
}
