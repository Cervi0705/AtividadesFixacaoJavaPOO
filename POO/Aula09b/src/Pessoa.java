public class Pessoa {
    private String nome, sexo;
    private int idade;

    //Metodos publicos

    public void fazerAniver(){
        setIdade(getIdade() + 1);
        System.out.println(getNome() + " está de Aniversário, fazendo " + getIdade() + " anos");
    }

    public void Status(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }

    //Metodos especiais

    @Override
    public String toString(){
        return this.nome;
    }

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
