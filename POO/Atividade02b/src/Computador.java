public class Computador {
    boolean ligado;
    int armazenamento;
    float preco;



    void ligar(){
        if (this.ligado == false){
            System.out.println("O computador está desligado");
        } else {
            System.out.println("Ligando");
        }

    }

    void status(){
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("Preço: " + this.preco);
    }
}
