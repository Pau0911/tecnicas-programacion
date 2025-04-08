package org.example;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public void maullar(){
        System.out.println(nombre + " está maullando.");
    }

}
