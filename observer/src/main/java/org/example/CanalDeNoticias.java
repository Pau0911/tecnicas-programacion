package org.example;

import java.util.ArrayList;
import java.util.List;

public class CanalDeNoticias {
    private List<Usuario> usuarios = new ArrayList<>();

    public void suscribir(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void publicarNoticia(String noticia) {
        for (Usuario usuario : usuarios) {
            usuario.recibirNoticia(noticia);
        }
    }

}
