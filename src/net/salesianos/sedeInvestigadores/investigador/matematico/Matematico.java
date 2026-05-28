package net.salesianos.sedeInvestigadores.investigador.matematico;
import net.salesianos.sedeInvestigadores.investigador.Investigador;

public class Matematico extends Investigador{
    
    private int[][] resultadosActuales;

    public Matematico(){}

    public Matematico(String nombre, String especialidad, int sueldo){
        super(nombre, especialidad, sueldo);
    }

    
}
