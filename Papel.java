package POO;

public class Papel {
    String texto;

    public void escribir(String cadena){
        this.texto = cadena;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
