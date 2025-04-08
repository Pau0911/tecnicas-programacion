package org.example;

import java.util.ArrayList;
import java.util.List;

public class Duenio {
    private String nombre;
    private String telefono;
    private List<Animal> animales;

    public Duenio(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        animal.setDuenio(this);
    }

    public void mostrarAnimales() {
        System.out.println(nombre + " tiene los siguientes animales");
        for (Animal animal : animales) {
            System.out.println("- " + animal.getNombre() + "(" + animal.getClass().getSimpleName() + ")");
        }
    }

    public String getNombre() {
        return nombre;
    }


}