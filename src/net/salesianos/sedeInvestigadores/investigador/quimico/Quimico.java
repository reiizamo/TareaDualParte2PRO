package net.salesianos.sedeInvestigadores.investigador.quimico;
import java.util.ArrayList;
import net.salesianos.sedeInvestigadores.colaboracion.Colaboracion;
import net.salesianos.sedeInvestigadores.investigador.Investigador;

public class Quimico extends Investigador implements Colaboracion{
    
    private ArrayList<String> elementos = new ArrayList<>();

    public Quimico(){}

    public Quimico(String nombre, String especialidad, int sueldo){
        super(nombre, especialidad, sueldo);
    }

    public String aniadirEspecimen(String elemento){
        this.elementos.add(elemento);
        return elemento + "añadido";
    }

    @Override
    public String estadoSueldo() {
        if (getSueldo() < 1200){
            return "Sueldo menos a 1200 euros, aumento necesario";
        }
        return "Sueldo de: " + getSueldo();
    }

    @Override
    public String trabajar() {
        for (int i = 0; i < this.elementos.size() / 2; i++) {
            int j = this.elementos.size() - 1 - i;
            String elemento = this.elementos.get(i);

            this.elementos.set(i, elementos.get(j));
            this.elementos.set(j, elemento);
        }

        System.out.print("Lista invertida:\n");
        for (String elemento : this.elementos) {
            System.out.println("    "+elemento+"\n");
        }
        return "Lista invertida correctamente";
    }

    @Override
    public String trabajoDual() {
        for (int i = 0; i < this.elementos.size() - 1; i++) {
            for (int j = 0; j < this.elementos.size() - 1 - i; j++) {
                if (this.elementos.get(j).length() > this.elementos.get(j + 1).length()) {
                    String especimen = this.elementos.get(j);
                    this.elementos.set(j, this.elementos.get(j + 1));
                    this.elementos.set(j + 1, especimen);
                }
            }
        }

        System.out.print("Ordenados:\n");

        for (String elemento : this.elementos) {
            System.out.print("   "+elemento+"\n");
        }

        this.elementos.remove(this.elementos.size() - 1);

        return this.elementos.get(this.elementos.size() - 1) + "Eliminado";
    }
}
