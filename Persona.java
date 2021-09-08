package POO;

import java.util.Random;

public class Persona {
    private int edad;
    private int dni;
    private int peso;
    private float altura;
    private String nombre;
    private char sexo;
    private char letraDni;
    Random rdn = new Random();

    public Persona(){
    }

    public Persona(String nombre, char sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona(String nombre, char sexo, int edad, float altura, int peso){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }


    public Persona(String nombre, char sexo, int edad, int dni, int peso, int altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }



    public int imc(){
        int imc = (int) (this.peso / (this.altura*this.altura));
        if (imc < 20){
            imc = -1;
        }
        else if(imc < 26) {
            imc = 0;
        }
        else imc = 1;
        return imc;
    }

    public boolean age(int edad){
        return edad < 18;
    }

    public void comprobarSexo(char sexo){
        if (sexo == 'h' || sexo == 'H'){
            setSexo(this.sexo = 'H');
        }
        else if (sexo == 'm' || sexo == 'M'){
            setSexo(this.sexo = 'M');
        }
        else setSexo(this.sexo = 'H');
    }

    @Override
    public String toString() {
        return "La Persona "+this.nombre+" de sexo "+this.sexo+" DNI "+this.letraDni+" "+this.dni+" de edad "+this.edad+" tiene un peso de "+this.peso+" y una altura de "+this.altura+" Mts.";
    }

    public void generaDNI(){

        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        this.dni = rdn.nextInt(40000000-15000000+1)+1500000;
        int letraDNI = (int) this.dni % 23;
        for (int i = 0; i < 23; i++) {
            if (i == letraDNI) {
                this.letraDni = letras[i];
            }
        }
    }

    public void imcMjs(Persona people){
        if (people.imc() == -1){
            System.out.println("Y usted está en su peso ideal, Felicitaciones!");
        }
        else if(people.imc() == 0){
            System.out.println("y usted se encuentra por debajo de su peso ideal");
        }
        else if(people.imc() == 1){
            System.out.println("y usted está con sobrepeso, por favor cuidese!");
        }
    }

    public void compAge(boolean age){
        if (!this.age(getEdad())){
            System.out.println(this.nombre+" es mayor de edad");
        }
        else System.out.println(this.nombre+" es menor de edad");
    }

}
