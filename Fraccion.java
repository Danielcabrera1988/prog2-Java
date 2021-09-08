package POO;

public class Fraccion {
    private int dividendo;
    private int divisor;

    public Fraccion() {
    }

    public Fraccion(int x, int y){
        this.dividendo = x;
        this.divisor = y;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public Fraccion sumar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion();

        int nuevoNumerador = this.dividendo * otraFraccion.getDivisor() +
                this.divisor * otraFraccion.getDividendo();
        int nuevoDenominador = this.divisor* otraFraccion.getDivisor();
        nuevaFraccion.setDividendo(nuevoNumerador);
        nuevaFraccion.setDivisor(nuevoDenominador);
        return nuevaFraccion;
    }
    public Fraccion multiplicar(Fraccion otraFraccion) {
        Fraccion nuevaFraccion = new Fraccion();

        int nuevoNumerador = this.dividendo * otraFraccion.getDividendo();
        int nuevoDenominador = this.divisor * otraFraccion.getDivisor();
        nuevaFraccion.setDividendo(nuevoNumerador);
        nuevaFraccion.setDivisor(nuevoDenominador);
        return nuevaFraccion;
    }

    public String toString() {
        if(divisor != 0) {
            return dividendo + "/" + divisor;
        }
        else return "El denominador debe ser distinto de 0";
    }
}
