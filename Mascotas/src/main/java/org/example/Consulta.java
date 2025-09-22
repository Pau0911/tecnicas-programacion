package org.example;

public class Consulta {

    private String descripcion;
    private Mascota mascota;
    private Veterinario veterinario;

    public Consulta(String descripcion, Mascota mascota, Veterinario veterinario) {
        this.descripcion = descripcion;
        this.mascota = mascota;
        this.veterinario = veterinario;
        mascota.agregarConsulta(this);
        veterinario.realizarConsulta(this);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

}
