package net.salesianos.sedeInvestigadores.investigador.quimico;
import java.util.ArrayList;
import net.salesianos.sedeInvestigadores.investigador.Investigador;

public class Quimico extends Investigador {
    
    private ArrayList<String> elementos = new ArrayList<>();

    public Quimico(){}

    public Quimico(String nombre, String especialidad, int sueldo){
        super(nombre, especialidad, sueldo);
    }

    
}
