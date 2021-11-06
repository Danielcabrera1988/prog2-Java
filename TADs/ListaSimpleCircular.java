package Listas;

public class ListaSimpleCircular{

    private Nodo first;
    private Nodo last;
    public int size;

    public ListaSimpleCircular(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean empty(){
        return this.first == null;
    }

    public void addBeginning(int valor){

        Nodo nuevo = new Nodo(valor);

        if(empty()){
            this.first = nuevo;
            this.last = nuevo;
            this.last.next = this.first;
        }else{
            this.last.next = nuevo;
            nuevo.next = this.first;
            this.first = nuevo;
        }
        this.size++;
    }

    public void addEnd(int valor){

        Nodo nuevo = new Nodo(valor);

        if(empty()){
            this.first = nuevo;
            this.last = nuevo;
            this.last.next = this.first;
        }else{
            Nodo puntero = this.first;
            while(puntero.next != this.first){
                puntero = puntero.next;
            }
            puntero.next = nuevo;
            this.last = nuevo;
            nuevo.next = this.first;
        }
        this.size++;
    }

    public void addPos(int valor, int pos){

        Nodo nuevo = new Nodo(valor);

        if(empty()){//comprueba si la lista está vacia y si lo está, agrega el primer nodo como primero y ultimo
            this.first = nuevo;
            this.last = nuevo;
            this.last.next = this.first;
        }else if(pos == 0){
            nuevo.next = this.first;
            this.first = nuevo;
            //this.last.next = nuevo;
        }
        else if(pos < this.size){//comprueba de que la pos solicitada sea menor que el tamaño de mi lista

            int cont = 0;
            Nodo puntero = this.first;

            while(cont < (pos - 1)){//el puntero sale con referencia al valor anterior a la pos buscada
                puntero = puntero.next;
                cont++;
            }
            nuevo.next = puntero.next;
            puntero.next = nuevo;

        }else System.out.println("Posicion fuera de rango");
        this.size++;
    }

    public void devNodo(int nodo){

        if(empty()){
            System.out.println("Lista vacia");
        }else if(nodo < this.size){

            Nodo puntero = this.first;
            int cont = 0;
            while(cont < nodo){
                puntero = puntero.next;
                cont++;
            }
            System.out.println("El contenido del nodo es ==>[" + puntero.valor + "]");
        }else System.out.println("Pedido de Nodo fuera de rango");
    }

    public void delFirst(){

        if(empty()){
            System.out.println("Lista vacia");
        }else{
            this.first = this.first.next;
            this.last.next = this.first;
        }
        this.size--;
    }

    public void delLast(){

        Nodo puntero = this.first;
        if(empty()){
            System.out.println("Lista vacia, no se puede eliminar el Nodo");
        }else{
            while(puntero.next.next != this.first){
                puntero = puntero.next;
            }
            puntero.next = this.first;
            this.last = puntero;
        }
        this.size--;
    }

    public void delPos(int nodo){

        Nodo puntero = this.first;
        int cont = 0;
        if(!empty()){//pregunta si la lista esta vacia
            if(nodo == 0){//pregunta por la pos cero

                this.first = this.first.next;
                this.last.next = this.first;

            }else if(nodo < this.size){

                if(puntero.next == this.last){

                    this.last = this.first;
                    this.last.next = this.first;

                }else{

                    while(cont < (nodo - 1)){//el puntero sale del bucle con el valor de referencia anterior a la pos buscada
                        puntero = puntero.next;
                        cont++;
                    }
                    puntero.next = puntero.next.next;
                }
            }
        }
        this.size--;
    }

    public void imprimir(){
        if(empty()){
            System.out.println("Lista vacia");
        }else{
            Nodo aux = this.first;
            for(int i = 0; i < this.size; i++){
                System.out.print("[" + aux.valor + "] --> ");
                aux = aux.next;
            }
        }
    }
}

