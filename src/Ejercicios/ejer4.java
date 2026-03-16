package Ejercicios;

public class ejer4 {
    public static void main(String[] args) {
        //los codigos con un if else de mas de 10 niveles se llaman code smell
        //por que son dificiles de mantener, poco legibles con mucha rigidez y son propensos a errores

        String Cliente = "Estudiante";

        double descuento = switch (Cliente) {
            case "Normal" -> 0.1;
            case "VIP" -> 0.2;
            case "Premiun" -> 0.3;
            case "Estudiante" -> 0.5;
            case "Empresa" -> 0.6;
            default -> 0.0;
        };

        System.out.println("Descuento: " + (descuento * 100) + "%");

        //objetos
        interface Cliente {
            double calcularDescuento();
        }

        class ClienteNormal implements Cliente {
            public double calcularDescuento() { return 0.1; }
        }

        class ClienteVIP implements Cliente {
            public double calcularDescuento() { return 0.2; }
        }

        class ClientePremium implements Cliente {
            public double calcularDescuento() { return 0.3; }
        }
        Cliente cliente = new ClientePremium();
        System.out.println("Descuento aplicado: " + (cliente.calcularDescuento() * 100) + "%");


    }
}
