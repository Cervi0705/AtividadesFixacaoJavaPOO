//Modificador	Mesmo Pacote	Subclasses	Qualquer Lugar
//public	        ✅	           ✅	          ✅
//protected	        ✅	           ✅	          ❌
//default	        ✅	           ❌	          ❌
//private	        ❌	           ❌	          ❌

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.modelo = "bic cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; private
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}