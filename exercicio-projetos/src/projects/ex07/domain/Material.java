package projects.ex07.domain;

import projects.ex07.interfaces.Identificavel;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Material implements Identificavel {

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

    @Override
    public Integer getId() {
        return this.id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
