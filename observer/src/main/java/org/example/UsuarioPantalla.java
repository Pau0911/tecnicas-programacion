package org.example;

public class UsuarioPantalla implements Usuario {
    private String nombre;

    public UsuarioPantalla(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirNoticia(String noticia) {
        System.out.println("[PANTALLA]" + nombre + "vio" + noticia);
    }
}
