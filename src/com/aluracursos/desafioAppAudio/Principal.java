package com.aluracursos.desafioAppAudio;

import com.aluracursos.desafioAppAudio.modelos.Canciones;
import com.aluracursos.desafioAppAudio.modelos.MisFavoritos;
import com.aluracursos.desafioAppAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Podcast elPopcast = new Podcast();
        elPopcast.setPodcaster("Raiza y Gera");
        elPopcast.setTitulo("El POPcast");
        elPopcast.setEpisodio("Vida Paranormal");
        elPopcast.setDuracion(60);
        elPopcast.muestraFichaTecnica();
        elPopcast.fichaTecnicaPodcast();

        for (int i = 0; i < 100; i++) {
            elPopcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            elPopcast.reproduce();
        }

        System.out.println("Total de Reproducciones: " + elPopcast.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + elPopcast.getTotalDeMeGusta());
        System.out.println("*******************");

        Canciones bornToDieLana = new Canciones();
        bornToDieLana.setArtista("Lana Del Rey");
        bornToDieLana.setTitulo("Born To Die");
        bornToDieLana.setGenero("POP");
        bornToDieLana.setDuracion(4);
        bornToDieLana.setAlbum("The Paradise");
        bornToDieLana.fichaTecnicaCanciones();
        bornToDieLana.muestraFichaTecnica();

        for (int i = 0; i < 400; i++) {
            bornToDieLana.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            bornToDieLana.reproduce();
        }


        System.out.println("Total de Reproducciones: " + bornToDieLana.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + bornToDieLana.getTotalDeMeGusta());
        System.out.println("*******************");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(elPopcast);
        favoritos.adiciona(bornToDieLana);


    }
}
