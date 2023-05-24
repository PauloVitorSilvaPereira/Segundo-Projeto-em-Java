package Modelos;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String genero;

    public void escreverMusica() {
        System.out.println("Artista: " + artista);
        System.out.println("Album: " + album);
        System.out.println("Gênero: " + genero);
    }

    @Override
    public int getClassificaco() {
        if (this.getTotalDeReproducoes() >= 14000) {
            return 10;
        } else {
            return 9;
        }

    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
