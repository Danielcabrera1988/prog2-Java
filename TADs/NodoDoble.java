package Listas;

public class NodoDoble {

    public int valor;
    public String valors;
    public NodoDoble next;
    public NodoDoble previous;

    public NodoDoble(int valor) {
        this.valor = valor;
        this.next = null;
        this.previous = null;
    }
    public NodoDoble(String valor) {
        this.valors = valor;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Info del Nodo: "+this.valor;
    }
}
