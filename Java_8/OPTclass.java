package Java_8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OPTclass {
public static void main(String[]args){
    String s = null;
    System.out.println(s);
    //System.out.println(s.equals("java"));

    Optional op1 = Optional.ofNullable(null);
    System.out.println(op1.equals("java"));
    Optional op2 = Optional.of(8);
    System.out.println(op2);
    System.out.println(op1);
    List<String> li = Arrays.asList("one","two","three");
    Optional op3=Optional.of(li);
    System.out.println(op3.isPresent());
    System.out.println(op1.isEmpty());
    System.out.println(op2.isEmpty());
    //li.stream().ifPresent(a-> System.out.println(a));
}
}
