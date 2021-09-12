package POO;

public class Videojuego {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado = false;
    private String genero;
    private String compania;

    public Videojuego(){}

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.compania = "";
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
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
