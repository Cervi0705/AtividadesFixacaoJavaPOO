public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("João","M",22,"j123");
        g[1] = new Gafanhoto("Maria","F",18,"m345");


        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());



        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(35.0f);
        System.out.println(vis[0].toString());




    }
}