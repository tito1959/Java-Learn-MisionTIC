package CollectionTest.TreeSetTest2;

public class Articulo implements Comparable<Articulo> {

    private int nArticle;
    private String description;

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

}
