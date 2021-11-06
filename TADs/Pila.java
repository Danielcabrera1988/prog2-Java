package Listas;

public class Pila {

    private Nodo ultimo;
    private int size;

    public Pila() {
        this.size = 0;
        this.ultimo = null;
    }

    public boolean vacia() {
        return this.ultimo == null;
    }

    // Apilar
    public void push(int valor) {

        Nodo nuevo = new Nodo(valor);
        if (vacia()) {
            this.ultimo = nuevo;
        }
        else{
            nuevo.next = this.ultimo;
            this.ultimo = nuevo;
        }
        this.size++;
    }

    // Desapilar
    public int pop() {
        if (vacia()) {
            return 0;
        }
        else{
            Nodo aux = new Nodo(this.ultimo.valor);

            this.ultimo = this.ultimo.next;
            this.size--;
            return aux.valor;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Pila vacia");
        }
        else{
            Nodo aux = this.ultimo;

            for(int i = 0; i < this.size; i++) {
                System.out.println(aux.valor);
                aux = aux.next;
            }
        }
    }
}
