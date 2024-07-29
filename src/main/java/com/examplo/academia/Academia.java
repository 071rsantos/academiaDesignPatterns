package com.examplo.academia;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private static Academia instance;
    private List<Membro> membros;

    private Academia() {
        membros = new ArrayList<>();
    }

    public static synchronized Academia getInstance() {
        if (instance == null) {
            instance = new Academia();
        }
        return instance;
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void removerMembro(Membro membro) {
        membros.remove(membro);
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void mostrarMembros() {
        System.out.println("Membros da Academia:");
        for (Membro membro : membros) {
            System.out.println(membro);
        }
    }
}

