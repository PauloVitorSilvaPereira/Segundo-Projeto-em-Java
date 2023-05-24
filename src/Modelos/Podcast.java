package Modelos;

public class Podcast extends Audio{

    private String host;
    private String descricao;

    public void escreverPodcast () {
        System.out.println("Host: " + host);
        System.out.println("Descrição: " + descricao);
    }

    @Override
    public int getClassificaco() {
        if (this.getCurtidas() >= 1000) {
            return 10;
        } else {
            return 9;
        }
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
