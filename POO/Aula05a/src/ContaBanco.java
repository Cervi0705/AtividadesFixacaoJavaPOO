public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo().equals("cc")){
            this.setSaldo(50);
        } else {
            this.setTipo("cp");
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossivel depositar");
        }

    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }

    }

    public void pagarMensal(){
        float v = 0;
        if (this.getTipo().equals("cc")){
            v = 12;
        } else if (this.getTipo().equals("cp")) {
            v = 20;
        } if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            } else System.out.println("Saldo insuficiente");

        } else {
            System.out.println("Impossível pegar");
        }
    }

    public void estadoAtual(){
        System.out.println("Conta: " +getNumConta());
        System.out.println("Tipo: " +getTipo());
        System.out.println("Dono: " +getDono());
        System.out.println("Saldo: " +getSaldo());
        System.out.println("Status: " +getStatus());

    }


}
