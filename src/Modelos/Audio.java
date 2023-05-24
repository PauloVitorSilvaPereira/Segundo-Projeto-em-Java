package Modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificaco;
    public void curtir () {
        curtidas++;
    }

    public void reproduzir () {
        totalDeReproducoes++;
    }

    public void escrever() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Total de Reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificaco() {
        return classificaco;
    }
}
