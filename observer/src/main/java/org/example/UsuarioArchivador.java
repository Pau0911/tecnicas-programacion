package org.example;

public class UsuarioArchivador implements Usuario {
    @Override
    public void recibirNoticia(String noticia) {
        System.out.println("[ARCHIVADOR] Noticia Archivada: " + noticia);
    }
}
