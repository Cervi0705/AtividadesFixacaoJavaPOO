public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[1];
        Livro l[] = new Livro[1];

        p[0] = new Pessoa("Arthur", "M", 20);

        l[0] = new Livro(250, p[0], "Caetano", "Era uma vez");

        System.out.println(l[0].detalhes());

        l[0].abrir();
        l[0].alcancarPag(250);
        System.out.println(l[0].getPagAtual());


    }
}