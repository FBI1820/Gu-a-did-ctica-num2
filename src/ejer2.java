import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        //Validador de fechas
        //Sin usar la clase LocalDate, determinar si una fecha (día, mes, año) proporcionada por el
        //usuario es válida. Se deben manejar meses de 30/31 días y la excepción de febrero en años
        //bisiestos.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el dia: ");

        int dia = entrada.nextInt();
        System.out.print("Ingresa el mes: ");

        int mes = entrada.nextInt();
        System.out.print("Ingresa el año: ");

        int año = entrada.nextInt();
        boolean esValida = true;


        if (mes < 1 || mes > 12) {
            esValida = false;
        } else {
            int diasEnMes;


            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    diasEnMes = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    diasEnMes = 30;
                    break;
                case 2:
                    // Verificamos si es año bisiesto
                    if ((año % 400 == 0) || (año % 4 == 0 && año % 100 != 0)) {
                        diasEnMes = 29;
                    } else {
                        diasEnMes = 28;
                    }
                    break;
                default:
                    diasEnMes = 0;
            }


            if (dia < 1 || dia > diasEnMes) {
                esValida = false;
            }
        }

        if (esValida) {
            System.out.println("La fecha es válida: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha NO es válida.");
        }

        entrada.close();
    }
}




