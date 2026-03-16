import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingresa el peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingresa la distancia: ");
        double distancia = entrada.nextDouble();


        boolean fragil = (peso < 50);


        if (peso > 50 && distancia > 100) {
            System.out.println("Método de envío: Transporte pesado");
        } else if (peso < 50 && fragil) {
            System.out.println("Método de envío: Envío Premium");
        } else if (peso < 10 && distancia < 20) {
            System.out.println("Método de envío: Dron");
        } else {
            System.out.println("Método de envío: Estándar");
        }

        entrada.close();
    }
}