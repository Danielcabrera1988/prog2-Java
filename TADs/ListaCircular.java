package Listas;

public class ListaCircular {

    private Nodo primero;
    private Nodo ultimo;
    public int size;

    public void Lista() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(int valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.ultimo.next = this.primero;
        } else {
            // usa los puntores a "primero" y "ultimo"
            this.ultimo.next = nuevo;
            nuevo.next = this.primero;
            ultimo = nuevo;
        }
        this.size++;
    }
    public void agregar(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.ultimo.next = this.primero;
        } else {
            // usa los puntores a "primero" y "ultimo"
            this.ultimo.next = nuevo;
            nuevo.next = this.primero;
            ultimo = nuevo;
        }
        this.size++;
    }


    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = primero;

            while (aux.next != this.primero) {
                aux = aux.next;
            }
            aux = null;
            this.size--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.size; i++) {
                System.out.println(aux.valor);
                aux = aux.next;
            }
        }
    }
}
