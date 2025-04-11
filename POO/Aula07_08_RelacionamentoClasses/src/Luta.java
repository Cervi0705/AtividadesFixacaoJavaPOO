import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    //Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            System.out.println("A luta não pode acontecer!");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(this.getAprovada()){
            System.out.println("###DESAFIADO###");
            this.getDesafiado().apresentar();
            System.out.println("###DESAFIANTE###");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;

                case 1: //Vitoria desafiado
                    System.out.println(this.desafiado + " ganhou!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;

                case 2: //Vitoria desafiante
                    System.out.println(this.desafiante + " ganhou!");
                    getDesafiado().perderLuta();
                    getDesafiante().ganharLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer!");
        }

    }

    //Métodos especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
