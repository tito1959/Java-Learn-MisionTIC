package CollectionTest.TreeSetTest;

import java.util.Comparator;

public class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int nArticle;
    private String description;

    public Articulo(){

    }

    public Articulo(int nArticle, String description) {
        this.nArticle = nArticle;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Articulo o) {
        return this.nArticle - o.nArticle;
    }

    @Override
    public int compare(Articulo o1, Articulo o2) {
        return o1.getDescription().compareTo(o2.getDescription()); // retorna 0, negativo o positivo (ver doc)
    }

}
