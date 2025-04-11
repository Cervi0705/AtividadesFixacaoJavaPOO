public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

         l[0] = new Lutador(31, 1, 2, 11, 68.9f,1.75f,
                "França","Pretty Boy");

        l[1] = new Lutador(29, 3, 2, 14, 57.8f  ,1.68f,
                "Brasil","Putscript");

        l[2] = new Lutador(35, 1, 2, 12, 80.9f  ,1.65f,
                "EUA","Snapshadow");

        l[3] = new Lutador(28, 2, 0, 13, 81.6f  ,1.93f,
                "Australia","Dead Code");

        l[4] = new Lutador(37 , 3, 4, 5, 119.3f  ,1.70f,
                "Brasil","Ufocobol");

        l[5] = new Lutador(30 , 4, 2, 12, 105.7f  ,1.81f,
                "EUA","Nerdaard");

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        l[0].Status();
        l[2].Status();

    }
}