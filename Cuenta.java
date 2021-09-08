package POO;

public class Cuenta {
    private String titular;
    private double cantidad = 0;



    public Cuenta(String nombre){
        this.titular = nombre;
    }
    public Cuenta(double cantidad){
        this.cantidad = cantidad;
    }

    public Cuenta() {
        this.titular = "name";
        this.cantidad = 0;
    }

    public double ingresar(double cantidad){

        if(cantidad<0){
            this.cantidad = this.cantidad;
        }
        else {
            this.cantidad = this.cantidad + cantidad;
        }
        return this.cantidad;
    }

    public double retirar(double cantidad){

         if(cantidad > this.cantidad){
             this.cantidad = 0;
         }
         else{
             this.cantidad = this.cantidad - cantidad;
         }
         return this.cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
