package Ejercicios;
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contrasena = sc.nextLine();

        boolean numero = contrasena.matches(".*\\d.*");
        boolean mayuscula = contrasena.matches(".*[A-Z].*");

        if (contrasena.length() > 8 && numero && mayuscula){
            System.out.println("Contraseña fuerte");
        } else if (contrasena.length() > 8 && numero) {
            System.out.println("Contraseña moderada ");
        } else {
            System.out.println("Contraseña insegura");
        }

    }
}
