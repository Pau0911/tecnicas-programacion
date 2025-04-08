package org.example;

public class Animal {

    protected String nombre;
    protected int edad;
    protected Duenio duenio;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer(){
        System.out.println(nombre+" esta comiendo.");
    }

    public  void dormir(){
        System.out.println(nombre + " esta dormido.");
    }

    public void setDuenio(Duenio duenio){
        this.duenio = duenio;
    }

    public Duenio getDuenio(){
        return duenio;
    }

    public String getNombre() {
        return nombre;
    }

}


