public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        for (int i=0; i < 5; i+= 1) {
            c.maisVolume();
        }
        c.play();
        c.abrirMenu();
        c.fecharMenu();

    }
}