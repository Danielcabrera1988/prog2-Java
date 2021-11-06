package Listas;

public class ListaDobleCircular{

    private NodoDoble first;
    private NodoDoble last;
    private int size;

    public ListaDobleCircular() {
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
            nuevo.next = this.last;
            nuevo.previous = this.first;
        }
        else{
            nuevo.next = this.first;
            nuevo.previous = this.last;
            this.last.next = nuevo;
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
            nuevo.next = this.last;
            nuevo.previous = this.first;
        }
        else{

            NodoDoble puntero = this.first;
            while(puntero.next != this.first){
                puntero = puntero.next;
            }
            nuevo.next = puntero.next;
            nuevo.previous = puntero;
            puntero.next = nuevo;
            this.last = nuevo;
        }
        this.size++;
    }

    public void addPos(int valor, int pos){

        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {

            this.first = nuevo;
            this.last = nuevo;
            nuevo.next = this.last;
            nuevo.previous = this.first;
        }
        else if(pos == 0){

            nuevo.next = this.first;
            nuevo.previous = this.last;
            this.last.next = nuevo;
            this.first.previous = nuevo;
            this.first = nuevo;

        }
        else if(pos < this.size){

                NodoDoble puntero = this.first;
                int cont = 0;

                while(cont < (pos - 1)){//puntero sale con referencia al nodo anterior a la pos que queremos añadir un nuevo nodo
                    puntero = puntero.next;
                    cont++;
                }
                if(puntero.next == this.last){
                    nuevo.next = this.last.next;
                    nuevo.previous = this.last;
                    this.last.next = nuevo;
                    this.last = nuevo;
                }
                else{
                    nuevo.next = puntero.next;
                    nuevo.previous = puntero;
                    puntero.next = nuevo;
                    puntero = nuevo.next;
                    puntero.previous = nuevo;
                }
            }
            else System.out.println("Posicion fuera de rango");
        this.size++;
    }

    public void delLast() {

        NodoDoble puntero = this.first;

        if (vacia()) {
            System.out.println("Lista vacia");
        }
        else if (this.size == 1) {
            this.first = null;
            this.last = null;
        }
        else{

            while(puntero.next.next != this.first){//obtengo referencia al anteultimo para asi eliminar el ultimo
                puntero = puntero.next;
            }
            puntero.next = this.last.next;
            this.first.previous = puntero;
            this.last = puntero;
        }
        this.size--;
    }

    public void delFirst(){

        if (vacia()) {
            System.out.println("Lista vacia");
        }
        else if(this.size == 1) {
            this.first = null;
            this.last = null;
        }
        else{
            this.last.next = this.first.next;
            this.first = this.first.next;
            this.first.previous = this.last;
        }
        this.size--;
    }

    public void delPos(int pos){

        if (vacia()) {
            System.out.println("Lista vacia");
        } else if(pos == 0) {
            this.last.next = this.first.next;
            this.first = this.first.next;
            this.first.previous = this.last;
        }
        else if(pos == (this.size - 1)){
            this.last = this.last.previous;
            this.last.next = this.first;
        }
        else if(pos < this.size){

                NodoDoble puntero = this.first;
                int cont = 0;

                while(cont < (pos - 1)){//Puntero sale con referencia a la pos anterior a la pos que quiero eliminar
                    puntero = puntero.next;
                    cont++;
                }
                NodoDoble aux = puntero.next.next;
                puntero.next = aux;
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
