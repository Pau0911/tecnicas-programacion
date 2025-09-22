package org.example;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre;
    private List<Consulta> consultas;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        this.consultas= new ArrayList<>();
    }

    public void realizarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }
    public List<Consulta> getConsultas(){
        return this.consultas;
    }
    public String getNombre(){
        return this.nombre;
    }

}
