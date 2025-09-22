package org.example;

public class Pato implements Volador, Nadador {

    @Override
    public void nadar() {
        System.out.println("El pato nada mucho");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela un poquito");
    }
}
