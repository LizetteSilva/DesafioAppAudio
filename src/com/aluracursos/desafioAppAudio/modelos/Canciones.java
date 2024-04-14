package com.aluracursos.desafioAppAudio.modelos;

public class Canciones extends Audio {
    private String artista;
    private String album;
    private String genero;

    @Override
    public int getClasificacion() {
           if (getTotalDeMeGusta() > 5000){
               return 8;
           }else {
               return 4;
           }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void fichaTecnicaCanciones(){
        System.out.println("Artista: " + artista);
        System.out.println("Album: " + album);
        System.out.println("Genero: " + genero);
    }

}
