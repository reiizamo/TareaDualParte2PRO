package net.salesianos.sedeInvestigadores.investigador.matematico;
import java.util.InputMismatchException;
import java.util.Scanner;

import net.salesianos.sedeInvestigadores.investigador.Investigador;

public class Matematico extends Investigador{
    
    private int[][] resultadosActuales = new int[3][3];

    public Matematico(){}

    public Matematico(String nombre, String especialidad, int sueldo){
        super(nombre, especialidad, sueldo);
    }

    public void multiplicarMatriz(int num){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.resultadosActuales[i][j] = this.resultadosActuales[i][j]*num;
                System.out.print(this.resultadosActuales[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumarMatrices(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.resultadosActuales[i][j] = this.resultadosActuales[i][j]+matriz[i][j];
                System.out.print(this.resultadosActuales[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String trabajar() {
        System.out.print("\n¿Qué desea hacer?\n");
        System.out.print("    1. Introducir un número\n");
        System.out.print("    2. Introducir una matriz 3x3\n");

        int opcion;

        try (Scanner sc = new Scanner(System.in)) {
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Introduce un número: ");
                int numero = sc.nextInt();

                multiplicarMatriz(numero);
                return "Matriz multiplicada correctamente";

            } else if (opcion == 2) {
                int[][] matriz = new int[3][3];
                System.out.println("Introduce la matriz 3x3:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz[i][j] = sc.nextInt();
                    }
                }

                sumarMatrices(matriz);
                return "Matrices sumadas correctamente";

            } else {
                return "Opción no válida";
            }

        } catch (InputMismatchException e) {
            return "Error: introduce solo números";
        }
    }

    @Override
    public String estadoSueldo() {
        if (getSueldo() < 1800){
            return "Sueldo menos a 1800 euros, aumento necesario";
        }
        return "Sueldo de: " + getSueldo();
    }
}
