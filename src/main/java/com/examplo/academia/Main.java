package com.examplo.academia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AcademiaConfig.class);
        Academia academia = context.getBean(Academia.class);

        Membro membro1 = context.getBean("membro1", Membro.class);
        Membro membro2 = context.getBean("membro2", Membro.class);

        academia.adicionarMembro(membro1);
        academia.adicionarMembro(membro2);

        academia.mostrarMembros();

        // Test Template Method pattern
        TreinoTemplate treinoCardio = new TreinoCardio();
        TreinoTemplate treinoForca = new TreinoForca();

        System.out.println("\nTreino de Cardio:");
        treinoCardio.realizarTreino();

        System.out.println("\nTreino de Força:");
        treinoForca.realizarTreino();
    }
}
