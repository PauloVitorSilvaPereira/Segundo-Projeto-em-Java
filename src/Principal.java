import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Musica dengo = new Musica();
        dengo.setTitulo("Dengo");
        dengo.setDuracao(2.33);
        dengo.setArtista("João Gomes");
        dengo.setAlbum("Digo Ou Não Digo");
        dengo.setGenero("Forró/Piseiro");
        dengo.getCurtidas();
        dengo.getTotalDeReproducoes();

        for (int i = 0; i < 15000; i++) {
            dengo.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            dengo.curtir();
        }

        dengo.escrever();
        dengo.escreverMusica();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Podcast do Azul, Vermelinho + Verdão");
        podcast.setDuracao(3.35);
        podcast.setDescricao("Conversa entre Azul, Vermelinho e Verdão.");
        podcast.setHost("Azul");
        podcast.getCurtidas();
        podcast.getTotalDeReproducoes();

        for (int i = 0; i < 10000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 900; i++) {
            podcast.curtir();
        }

        podcast.escrever();
        podcast.escreverPodcast();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(dengo);
        preferidas.inclui(podcast);
    }
}
