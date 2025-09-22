package org.example;

public class Gato extends Mascota{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau Miau");
    }
}
