import java.util.Scanner;


public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    Scanner scanner = new Scanner(System.in);

    public String detalhes() {
        return "titulo=" + titulo  +
                ",\n autor=" + autor +
                ",\n totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ",\n aberto=" + aberto +
                ",\n leitor=" + leitor +
                ", idade=" + leitor.getIdade()+
                ", leitor=" + leitor.getSexo();
    }

    //Metodos publicos

    @Override
    public void abrir() {
        if (!getAberto()){
            setAberto(true);
            System.out.println("O livro foi aberto");
        } else{
            System.out.println("O livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (getAberto()){
            setAberto(false);
            System.out.println("O livro foi fechado");
        } else{
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        if (getPagAtual() <= getTotPaginas() - 1 && getAberto()){
            setPagAtual(getPagAtual() + 1);
            System.out.println("Você avançou uma página. Página atual: pg" + getPagAtual());
        } else if (!getAberto()) {
            System.out.println("Abra o livro para continuar.");
        } else {
            System.out.println("Impossivel folhear página");
        }
    }

    @Override
    public void alcancarPag(int pagina) {
        if (getPagAtual() < pagina && getAberto() && pagina <= totPaginas){
            setPagAtual(pagina);
            System.out.println("Você folheou até a página: pg" + getPagAtual());
        } else if (!getAberto()) {
            System.out.println("Você deve abrir o livro");
        } else {
            System.out.println("Digite um número de páginas válido");
        }
    }

    @Override
    public void voltarPag() {
        if (getPagAtual() >0 && getPagAtual() <= getTotPaginas()){
            setPagAtual(getPagAtual()-1);
            System.out.println("Você voltou uma página. Página atual: pg" + getPagAtual());
        } else {
            System.out.println("Impossivel voltar página");
        }
    }

    //Metodos especial

    public Livro(int totPaginas, Pessoa leitor, String autor, String titulo) {
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
