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

    }

    private static void menuMatematico(Matematico mate, Scanner sc) {
        try {
            System.out.print("\n--- MENÚ MATEMÁTICO ---\n");
            System.out.print("    1. Estado Sueldo\n");
            System.out.print("    2. Trabajar\n");

            int op = sc.nextInt();

            switch (op) {
                case 1 :
                    System.out.println(mate.estadoSueldo());
                    break;
                case 2 :
                    System.out.println(mate.trabajar());
                    break;
                default :
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
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: entrada incorrecta");
        }
    }
}
