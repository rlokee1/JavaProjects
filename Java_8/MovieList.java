package Java_8;

public class MovieList {
    private String name;
    private Integer collection;
    private Integer year;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){return name;}

    public Integer getCollection(){
        return collection;
    }
    public void setInt(Integer i){
        this.year=year;
    }
    public Integer getInt(){
        return year;
    }

    public MovieList(String name, Integer collection,Integer year){
        this.name=name;
        this.year=year;
        this.collection=collection;
    }
}
