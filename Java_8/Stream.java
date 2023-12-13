package Java_8;
import java.util.*;
import java.util.stream.*;

class Stream {
    public static void main(String[]args){
        List<MovieList>hit=Arrays.asList(new MovieList("leo",625,2023),
        new MovieList("Jailer",540,2023),
        new MovieList("Jawan",1200,2023));
        hit.stream()
                .filter(m->m.getCollection()>600)
                .map(MovieList::getName)
                .forEach(System.out::println);
    }
}

class Stream1{
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNum = numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
                //forEach(System.out::println);
        System.out.println(evenNum);
    }
}