package POO;

public class Mate {
    int cebadas;
    boolean estado = false;

    public Mate(int cebadas){
        this.cebadas = cebadas;
    }

    public void cebar(){

        if(!this.estado){
            System.out.println("Mate cebado");
            this.estado = true;
        }
        else System.out.println("Cuidado! Te quemaste!");
    }

    public void beber(){

        if (!this.estado){
            System.out.println("El mate está vacío!");
        }
        else {
            System.out.println("Mate bebido");
            this.estado = false;
            this.cebadas--;
            if (this.cebadas < 0) {
                System.out.println("El mate está lavado");
                this.cebadas = 0;
            }
        }


    }
}
