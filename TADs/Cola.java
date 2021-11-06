package Listas;

public class Cola{

    private Nodo primero;
    private Nodo ultimo;
    private int size;

    public Cola(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean vacia(){
        return this.primero == null;
    }

    // enqueue
    public void encolar(int valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        else{
            this.ultimo.next = nuevo;
            this.ultimo = nuevo;
        }
        this.size++;
    }

    // dequeue
    public int desencolar(){

        if (vacia()) {
            return 0;
        }
        else{
            int aux = this.primero.valor;
            this.primero = this.primero.next;
            this.size--;
            return aux;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Cola vacia");
        }
        else{
            Nodo aux = this.primero;
            for(int i = 0; i < this.size; i++) {
                System.out.println(aux.valor);
                aux = aux.next;
            }
        }
    }
}
