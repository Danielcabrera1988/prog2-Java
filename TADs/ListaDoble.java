package Listas;

public class ListaDoble {

    private NodoDoble first;
    private NodoDoble last;
    private int size;

    public ListaDoble() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public void size(){
        System.out.println("El tamaño de la lista es de "+this.size+" elementos");
    }
    public boolean vacia() {
        return this.first == null;
    }

    public void addBeginning2(int valor) {

        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.first = nuevo;
            this.last = nuevo;
        }
        else{
            nuevo.next = this.first;
            this.first.previous = nuevo;
            this.first = nuevo;
        }
        this.size++;
    }

    public void addEnd(int valor){

        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.first = nuevo;
            this.last = nuevo;
        }
        else{
            NodoDoble puntero = this.first;
            while(puntero.next != null){
                puntero = puntero.next;
            }
            puntero.next = nuevo;
            nuevo.previous = puntero;
            this.last = nuevo;
        }
        this.size++;
    }

    public void addPos(int valor, int pos){

        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.first = nuevo;
            this.last = nuevo;
        }
        else if (pos < this.size){

            NodoDoble aux = this.first;
            int cont = 0;

            while(cont < pos && aux.next != null){
                aux = aux.next;
                cont++;
            }
            nuevo.next = aux;
            nuevo.previous = aux.previous;
            aux = nuevo.previous;
            aux.next = nuevo;
            aux = nuevo.next;
            aux.previous = nuevo;
        }
        this.size++;
    }

    public void eliminarUltimo() {

        NodoDoble puntero = this.first;

        if (vacia()) {
            System.out.println("Lista vacia");
        } else if (this.first.next == null) {
            this.first = null;
            this.last = null;
        }
        else{
            while(puntero.next.next != null){//obtengo referencia al anteultimo para asi eliminar el ultimo
                puntero = puntero.next;
            }
            this.last = puntero;
            puntero.next = null;
        }
        this.size--;
    }

    public void eliminarPrimero(){

        if (vacia()) {
            System.out.println("Lista vacia");
        }
        else if(this.first.next == null) {
            this.first = null;
            this.last = null;
        }
        else{
            this.first = this.first.next;
            this.first.previous = null;
        }
        this.size--;
    }

    public void eliminarPos(int pos){

        if (vacia()) {
            System.out.println("Lista vacia");
        } else if (this.first.next == null) {
            this.first = null;
            this.last = null;
        }
        else if (pos < this.size){

            NodoDoble aux = this.first;
            int cont = 0;

            while(cont < pos && aux.next != null){
                aux = aux.next;
                cont++;
            }//aux sale con el valor del nodo que inica pos
            NodoDoble puntero = aux.previous;
            puntero.next = aux.next;
            aux = puntero.next;
            assert aux != null;
            aux.previous = puntero;
        }
        this.size--;
    }

    public void imprimir() {

        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = this.first;

            for(int i=0;i<this.size;i++){
                System.out.print("["+aux.valor+"] --> ");
                aux = aux.next;
            }
        }
    }

    public void imprimirInverso() {

        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = this.last;

            for(int i = 0; i < this.size; i++){
                System.out.print("["+aux.valor+"] --> ");
                aux = aux.previous;
            }
        }
    }
}
