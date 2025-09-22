package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private Adoptante adoptante;
    private List<Consulta> consultas;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.consultas = new ArrayList<>();
    }

    public void agregarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public List<Consulta> getConsultas(){
        return this.consultas;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante){
        this.adoptante = adoptante;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public abstract void emitirSonido();

}
