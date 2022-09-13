package Enumeracion;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println("Dia: " + Dias.LUNES);
        indicarDiaSemana(Dias.DOMINGO);
    }

    private static void indicarDiaSemana(Dias dia) {

        switch (dia) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Ultimo dia de la semana");
                break;
            case JUEVES:
                System.out.println("Juevess!");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            default:
                break;
        }
    }
}
