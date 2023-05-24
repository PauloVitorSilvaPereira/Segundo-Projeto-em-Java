package Modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificaco() == 10) {
            System.out.println(audio.getTitulo() + " está no topo das listas!");
        } else {
            System.out.println(audio.getTitulo() + " é bem popular na plataforma!");
        }
    }
}
