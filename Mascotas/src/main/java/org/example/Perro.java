package org.example;

public class Perro extends Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau Guau");
    }
}
