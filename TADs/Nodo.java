package Listas;


public class Nodo {

    public int valor;
    public String valorS;
    public Nodo next;


    public Nodo(int valor) {
        this.valor = valor;
        this.next = null;
    }
    public Nodo(String valor) {
        this.valorS = valor;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Info del Nodo: "+this.valor;
    }
}

