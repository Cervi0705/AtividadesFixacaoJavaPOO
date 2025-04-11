public class Aula {
    float duracao;
    int alunos;
    String modalidade;



    void ComecarAulaOnline(){
        if (this.modalidade == "presencial"){
            System.out.println("A aula é presencial hoje");
        } else {
            System.out.println("Gerando link da aula...");
        }
    }


    void status(){
        System.out.println("Duração: " + this.duracao);
        System.out.println("Alunos: " + this.alunos);
        System.out.println("Modalidade: " + this.modalidade);
    }
}
