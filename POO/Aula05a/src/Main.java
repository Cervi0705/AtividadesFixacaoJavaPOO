public class Main {
    public static void main(String[] args) {
    ContaBanco p1 = new ContaBanco();
    p1.setNumConta(1111);
    p1.setDono("João");
    p1.abrirConta("cc");

    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(2222);
    p2.setDono("Claudia");
    p2.abrirConta("cp");

    p1.depositar(100);
    p2.depositar(500);
    p2.sacar(100);


    p1.sacar(150);
    p1.fecharConta();

    p1.estadoAtual();
    System.out.println();
    p2.estadoAtual();
    }
}