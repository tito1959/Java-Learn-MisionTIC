package Enumeracion;

public enum Continentes {
    /*
     * Constantes que contienen atributos:
     */

    AFRICA(53, "1.2 billones"),
    EUROPA(46, "0.5 billones"),
    ASIA(44, "3 billones"),
    AMERICA(34, "4 billones"),
    OCEANIA(14, "1.2 billones");

    private final int paises;
    private final String pop;

    Continentes(int paises, String pop) {
        this.paises = paises;
        this.pop = pop;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getPop() {
        return this.pop;
    }
}
