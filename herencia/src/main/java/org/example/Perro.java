package org.example;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void ladrar(){
        System.out.println(nombre + " está ladrando.");
    }

}
