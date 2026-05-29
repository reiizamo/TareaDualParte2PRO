import java.util.InputMismatchException;
import java.util.Scanner;

import net.salesianos.sedeInvestigadores.investigador.biologo.Biologo;
import net.salesianos.sedeInvestigadores.investigador.matematico.Matematico;
import net.salesianos.sedeInvestigadores.investigador.quimico.Quimico;

public class App {
    public static void main(String[] args) throws Exception {
        Matematico matematico = new Matematico("Finn", "Algebra", 2000);
        Biologo biologo = new Biologo("Oriday", "Marina", 1600);
        Quimico quimico = new Quimico("Walter", "Organica", 1300);

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        try {
            do {
                System.out.print("\n=== MENÚ PRINCIPAL ===\n");
                System.out.print("    1. Matemático\n");
                System.out.print("    2. Biólogo\n");
                System.out.print("    3. Químico\n");
                System.out.print("    0. Salir\n\n");
                System.out.print("Elige investigador: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        menuMatematico(matematico, sc);
                        break;
                    case 2:
                        menuBiologo(biologo, sc);
                        break;
                    case 3:
                        menuQuimico(quimico, sc);
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }

            } while (opcion != 0);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir números.");
        } finally {
            sc.close();
            System.out.println("Scanner cerrado correctamente.");
        }
    }

    private static void menuMatematico(Matematico mate, Scanner sc) {
        try {
            System.out.print("\n--- MENÚ MATEMÁTICO ---\n");
            System.out.print("    1. Estado Sueldo\n");
            System.out.print("    2. Trabajar\n");
            System.out.print("    3. Identificación\n");
            System.out.print("    4. Calculo simple\n");

            int op = sc.nextInt();

            switch (op) {
                case 1 :
                    System.out.println(mate.estadoSueldo());
                    break;
                case 2 :
                    System.out.println(mate.trabajar());
                    break;
                case 3 :
                    System.out.println(mate.identificion());
                    break;
                case 4 :
                    System.out.print("Introduce el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println(mate.hacerCalculo(num1, num2));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada incorrecta");
        }

    }

    private static void menuBiologo(Biologo bio, Scanner sc) {
        try {
            System.out.println("\n--- MENÚ BIÓLOGO ---");
            System.out.print("    1. Estado Sueldo\n");
            System.out.print("    2. Añadir espécimen\n");
            System.out.print("    3. Trabajar\n");
            System.out.print("    4. Trabajo dual\n");
            System.out.print("    5. Identificación\n");
            System.out.print("    6. Calculo simple\n");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(bio.estadoSueldo()); 
                    break;
                case 2: 
                    System.out.print("Introduce espécimen: ");
                    String especimen = sc.next();
                    System.out.println(bio.aniadirEspecimen(especimen));
                    break;
                case 3:
                    System.out.println(bio.trabajar());
                    break;
                case 4:
                    System.out.println(bio.trabajoDual());
                    break;
                case 5 :
                    System.out.println(bio.identificion());
                    break;
                case 6 :
                    System.out.print("Introduce el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println(bio.hacerCalculo(num1, num2));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada incorrecta");
        }
    }

    private static void menuQuimico(Quimico qui, Scanner sc) {
        try {
            System.out.println("\n--- MENÚ QUÍMICO ---");
            System.out.print("    1. Estado Sueldo\n");
            System.out.print("    2. Añadir elemento\n");
            System.out.print("    3. Trabajar\n");
            System.out.print("    4. Trabajo dual\n");
            System.out.print("    5. Identificación\n");
            System.out.print("    6. Calculo simple\n");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(qui.estadoSueldo());
                    break;
                case 2:
                    System.out.print("Introduce elemento: ");
                    String elemento = sc.next();
                    System.out.println(qui.aniadirEspecimen(elemento));
                    break;
                case 3:
                    System.out.println(qui.trabajar());
                    break;
                case 4:
                    System.out.println(qui.trabajoDual());
                    break;
                case 5 :
                    System.out.println(qui.identificion());
                    break;
                case 6 :
                    System.out.print("Introduce el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println(qui.hacerCalculo(num1, num2));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: entrada incorrecta");
        }
    }
}
