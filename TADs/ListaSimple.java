package Listas;

public class ListaSimple {

    private Nodo first;
    public int size;

    public ListaSimple() {
        this.first = null;
        this.size = 0;
    }

    public boolean empty() {
        return this.first == null;
    }

    public void addBeginning(int valor) {

        Nodo nuevo = new Nodo(valor);

        if (empty()){
            this.first = nuevo;
            nuevo.next = null;
        }
        else{
            nuevo.next = this.first;
            this.first = nuevo;
        }
        this.size++;
    }

    public void addEnd (int valor){

        Nodo nuevo = new Nodo(valor);

        if (empty()){
            this.first = nuevo;
        }
        else{
            Nodo puntero = this.first;
            while(puntero.next != null){
                puntero = puntero.next;
            }
            puntero.next = nuevo;
        }
        this.size++;
    }

    public void addPos (int valor, int pos){

        Nodo nuevo = new Nodo(valor);

        if (empty()){
            this.first = nuevo;
        }
        else if (pos < this.size){

                int cont = 0;
                Nodo puntero = this.first;

                while(cont < (pos-1) && puntero != null){
                    puntero = puntero.next;
                    cont++;
                }
            assert puntero != null;
            nuevo.next = puntero.next;
                puntero.next = nuevo;
        }
        else System.out.println("Posicion fuera de rango");
        this.size++;
    }

    public void devNodo(int nodo){

        if (empty()){
            System.out.println("Lista vacia");
        }
        else if (nodo < this.size){

            Nodo puntero = this.first;
            int cont = 0;
            while(cont < nodo && puntero.next != null){
                puntero = puntero.next;
                cont++;
            }
            System.out.println("El contenido del nodo es ==>["+puntero.valor+"]");
        }
        else System.out.println("Pedido de lista fuera de rango");
    }

    public void delFirst(){

        if (empty()){
            System.out.println("Lista vacia");
        }
        else{
            this.first = this.first.next;
        }
        this.size--;
    }
    public void delLast() {

        Nodo puntero = this.first;
        if (empty()){
            System.out.println("Lista vacia, no se puede eliminar el Nodo");
        }
        else if (this.first.next == null){
            this.first = null;
        }
        else{
            while (puntero.next.next != null) {
                puntero = puntero.next;
            }
            puntero.next = null;
        }
        this.size--;
    }

    public void delPos(int nodo) {

        Nodo puntero = this.first;

        if (puntero != null) {
            if (nodo == 0) {
                this.first = this.first.next;
            } else if (nodo < this.size){
                int cont = 0;
                while (cont < (nodo - 1)) {
                    puntero = puntero.next;
                    cont++;
                }
                Nodo temp = puntero.next;
                puntero.next = temp.next;
                temp.next = null;
            }
            this.size--;
        }
    }

    public void imprimir() {
        if (empty()) {
            System.out.println("Lista vacia");
        }
        else{
            Nodo aux = this.first;
            for(int i = 0; i<this.size; i++) {
                System.out.print("["+aux.valor+"] --> ");
                aux = aux.next;
            }
        }
    }
}
