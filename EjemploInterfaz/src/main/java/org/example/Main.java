package org.example;

public class Main {
    public static void main(String[] args) {

        Pato pato = new Pato();
        pato.nadar();
        pato.volar();
    }
}

/*

//Inversión de Dependencias

interface BaseDeDatos {
    void conectar();
}

class MySQL implements BaseDatos {
    public void conectar() {
        System.out.println("Conectando a MySQL");
    }

}

class Oracle implements BaseDatos {
    public void conectar() {
        System.out.println("Conectando a Oracle");
    }

}

class Aplicacion {
    BaseDeDatos bd;

    public Aplicacion(BaseDeDatos bd) {
        this.bd = bd;
    }
}
*/



