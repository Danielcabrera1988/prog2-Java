package POO;

public class Serie {
    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){}

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, String creador, String genero, int numTemporadas){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.numTemporadas = numTemporadas;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void entregar(){
        this.entregado = true;
    }

    public void devolver(){
        this.entregado = false;
    }

    public boolean isEntregado(){
        return this.entregado;
    }
}
