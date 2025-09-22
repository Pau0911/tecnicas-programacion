package org.example;

import java.util.ArrayList;
import java.util.List;

public class Adoptante {

    private String nombre;
    private List<Mascota> mascotas;

    public Adoptante(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public void adoptarMascota(Mascota mascota){
        this.mascotas.add(mascota);
        mascota.setAdoptante(this);
    }

    public List<Mascota> getMascotas(){
        return this.mascotas;
    }

    public String getNombre(){
        return this.nombre;
    }

}
