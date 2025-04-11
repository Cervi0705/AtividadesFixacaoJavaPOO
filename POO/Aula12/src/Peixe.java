public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de peixe");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

}
