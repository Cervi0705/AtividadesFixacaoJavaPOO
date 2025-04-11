//fazer atividade com 1 objeto material e 1 conceitual, utilizando os conceitos de POO

public class Main {
    public static void main(String[] args) {

        Computador c1 = new Computador();
        Aula a1 = new Aula();

        c1.ligado = true;
        c1.armazenamento = 256;
        c1.preco = 1000;

        a1.modalidade = "presencial";
        a1.alunos = 35;
        a1.duracao = 2.5F;

        c1.status();
        System.out.println();
        a1.status();
        System.out.println();

        a1.ComecarAulaOnline();
        c1.ligar();

    }
}