package com.aluracursos.desafioAppAudio.modelos;

public class Podcast extends Audio {
    private String podcaster;

    private String episodio;

    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 2000){
            return 9;
        }else{
            return 2;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getPodcaster() {
        return podcaster;
    }

    public void setPodcaster(String podcaster) {
        this.podcaster = podcaster;
    }

    public void fichaTecnicaPodcast(){
        System.out.println("Podcaster: " + podcaster);
        System.out.println("Episodio: " + episodio);

    }


}
