package projects.ex07.domain;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Material {

    private Integer id;
    private String titulo;
    private boolean disponivel = true;

    public Material(String titulo) {

        this.id = ThreadLocalRandom.current().nextInt();
        this.titulo = titulo;
    }

    public boolean emprestarMaterial() {

        if (!this.disponivel) {

            throw new IllegalArgumentException("Material indisponível");
        }

        return this.disponivel = false;
    }

    public boolean devolverMaterial() {

        return this.disponivel = true;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
