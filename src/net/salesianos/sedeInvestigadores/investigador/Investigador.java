package net.salesianos.sedeInvestigadores.investigador;


public abstract class Investigador {
    private String nombre;
    private String especialidad;
    private int sueldo;

    public Investigador(){}

    public Investigador(String nombre, String especialidad, int sueldo){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getEspecialidad(){
        return this.especialidad;
    }
    public int getSueldo(){
        return this.sueldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }

     public String identificion(){
        return "Nombre: " + this.nombre + "\n"+
                "Especialidad: " + this.especialidad + "\n"+
                "Sueldo: " + this.sueldo;
     }

    public String hacerCalculo(int num1, int num2){
        return "Suma de: " + num1 + " + " + num2 + " = " + (num1+num2) + "\n" +
                "Resta de: " + num1 + " - " + num2 + " = " + (num1-num2);
    }

    public abstract String estadoSueldo();
    public abstract String trabajar();

}
