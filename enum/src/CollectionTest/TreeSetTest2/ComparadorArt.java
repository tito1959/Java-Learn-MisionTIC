package CollectionTest.TreeSetTest2;

import java.util.Comparator;

public class ComparadorArt implements Comparator<Articulo> {

    @Override
    public int compare(Articulo o1, Articulo o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }

}
