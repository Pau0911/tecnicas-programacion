package org.example;

public class Main {
    public static void main(String[] args) {

        Duenio duenio1 = new Duenio("Luis","666-09-09");

        Perro perro = new Perro("Mona",12,"Chihuahua");
        Gato gato = new Gato("Chester",2,"Blanco");
        gato.comer();
        perro.ladrar();
        perro.comer();
        duenio1.agregarAnimal(perro);
        duenio1.agregarAnimal(gato);
        duenio1.mostrarAnimales();
        
    }
}