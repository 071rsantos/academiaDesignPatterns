package com.examplo.academia;

public abstract class TreinoTemplate {

    public final void realizarTreino() {
        aquecer();
        exercicioPrincipal();
        esfriar();
    }

    protected abstract void exercicioPrincipal();

    private void aquecer() {
        System.out.println("Aquecendo...");
    }

    private void esfriar() {
        System.out.println("Esfriando...");
    }
}

