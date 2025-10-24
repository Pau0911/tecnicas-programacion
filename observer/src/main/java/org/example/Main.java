package org.example;


public class Main {
    public static void main(String[] args) {

        CanalDeNoticias canal = new CanalDeNoticias();

        Usuario usuario1 = new UsuarioPantalla("Luisa");
        Usuario usuario2 = new UsuarioCorreo("carlos@gmail.com");
        Usuario usuario3 = new UsuarioArchivador();

        canal.suscribir(usuario1);
        canal.suscribir(usuario2);
        canal.suscribir(usuario3);

        canal.publicarNoticia("Nueva noticia: Java 21 lanzado!");
    }
}