package net.salesianos.sedeInvestigadores.investigador.biologo;
import java.util.ArrayList;
import net.salesianos.sedeInvestigadores.colaboracion.Colaboracion;
import net.salesianos.sedeInvestigadores.investigador.Investigador;

public class Biologo extends Investigador implements Colaboracion{
    
    private ArrayList<String> especimenes = new ArrayList<>();

    public Biologo(){}

    public Biologo(String nombre, String especialidad, int sueldo){
        super(nombre, especialidad, sueldo);
    }

    public String aniadirEspecimen(String especimen){
        this.especimenes.add(especimen);
        return especimen + "añadido";
    }

    @Override
    public String estadoSueldo() {
        if (getSueldo() < 1500){
            return "Sueldo menos a 1500 euros, aumento necesario";
        }
        return "Sueldo de: " + getSueldo();
    }

    @Override
    public String trabajar() {
        for (int i = 0; i < this.especimenes.size() - 1; i++) {
            for (int j = 0; j < this.especimenes.size() - 1 - i; j++) {
                if (this.especimenes.get(j).length() > this.especimenes.get(j + 1).length()) {
                    String especimen = this.especimenes.get(j);
                    this.especimenes.set(j, this.especimenes.get(j + 1));
                    this.especimenes.set(j + 1, especimen);
                }
            }
        }

        System.out.print("Ordenados:\n");

        for (String especimen : this.especimenes) {
            System.out.print("   "+especimen+"\n");
        }

        this.especimenes.remove(this.especimenes.size() - 1);

        return this.especimenes.get(this.especimenes.size() - 1) + "Eliminado";
    }

    @Override
    public String trabajoDual() {
        for (int i = 0; i < this.especimenes.size() / 2; i++) {
            int j = this.especimenes.size() - 1 - i;
            String especimen = this.especimenes.get(i);

            this.especimenes.set(i, this.especimenes.get(j));
            this.especimenes.set(j, especimen);
        }

        System.out.print("Lista invertida:\n");
        for (String especimen : this.especimenes) {
            System.out.println("    "+especimen+"\n");
        }
        return "Lista invertida correctamente";
    }
}
