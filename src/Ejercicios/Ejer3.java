package Ejercicios;

public class Ejer3 {
    public static void main(String[] args) {
        int peliculanum = 4;

        String pelicula = switch (peliculanum){
            case 1 -> "Ladrón de bicicletas";
            case 2 -> "Los 400 golpes";
            case 3 -> "El padrino";
            case 4 -> "Conductor de taxi";
            case 5 -> "Mago de Oz";
            default -> "Numero invalido";

        };

        System.out.println(pelicula);
    }
}
