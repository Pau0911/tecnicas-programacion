package org.example;

public class UsuarioCorreo implements Usuario {

    private String correo;

    public UsuarioCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void recibirNoticia(String noticia) {
        System.out.println("[CORREO] Enviando a" + correo + ":" + noticia);
    }
}
