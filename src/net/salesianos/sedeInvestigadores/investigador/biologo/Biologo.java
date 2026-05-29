package net.salesianos.sedeInvestigadores.investigador.biologo;
import java.util.ArrayList;
import net.salesianos.sedeInvestigadores.investigador.Investigador;

public class Biologo extends Investigador{
    
    private ArrayList<String> especimenes = new ArrayList<>();

    public Biologo(){}

    public Biologo(String nombre, String especialidad, int sueldo){
        super(nombre, especialidad, sueldo);
    }

}
