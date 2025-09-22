package org.example;

public class Main {
    public static void main(String[] args) {
        Adoptante adoptante= new Adoptante("Paula");
        Mascota perro = new Perro("Mona",12);
        Mascota gato = new Gato ("Chester",2);

        adoptante.adoptarMascota(perro);
        adoptante.adoptarMascota(gato);


    }
}