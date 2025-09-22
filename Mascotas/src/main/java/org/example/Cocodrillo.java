package org.example;

public class Cocodrillo extends Mascota  {

    public Cocodrillo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Rugido");
    }
}
